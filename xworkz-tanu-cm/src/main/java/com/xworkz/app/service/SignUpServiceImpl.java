package com.xworkz.app.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.app.dto.SignUpDto;
import com.xworkz.app.entity.SignUpEntity;
import com.xworkz.app.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService  {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public SignUpServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public Long findByUser(String user) {
		Long userCount = this.signUpRepository.findByUser(user);
		return userCount;
	}
	
	
	@Override
	public Long findByEmail(String email) {
		Long emailCount = this.signUpRepository.findByEmail(email);
		return emailCount;
	}
	

	@Override
	public Long findByMobile(Long mobile) {
		Long mobileCount = this.signUpRepository.findByMobile(mobile);
		return mobileCount;
	}
	

	@Override
	public Set<ConstraintViolation<SignUpDto>> validateAndSave(SignUpDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SignUpDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		} else {
			log.info("Violation is not There in dto, can Save the data");
			
			Long count = this.signUpRepository.findCountByEmailAndUserAndMobile(dto.getEmail(), dto.getUserId(), dto.getMobileNumber());

			if(count == 0) {
			
			SignUpEntity entity = new SignUpEntity();
			entity.setUserId(dto.getUserId());
			entity.setEmail(dto.getEmail());
			entity.setMobileNumber(dto.getMobileNumber());
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
			entity.setPassword(passwordEncoder.encode(dto.getPassword()));
			//BeanUtils.copyProperties(dto, entity);
			
			boolean saved = this.signUpRepository.save(entity);
			boolean sent = sendMail("rghiremath26@gmail.com");
			log.info("Email sent " + sent);
			log.info("Entity Data is Saved " + saved);
			
			}
			else {
				System.out.println("data already exists");
				return null;
			}
		}
			return Collections.emptySet();
			
		}
	
//	
//	@Override
//	public SignUpDto findByIdAndPassword(String userId, String password) {
//		SignUpEntity entity = this.signUpRepository.findByIdAndPassword(userId, password);
//		SignUpDto dto = new SignUpDto();
//		dto.setUserId(entity.getUserId());
//		dto.setPassword(entity.getPassword());
//		if (dto.getUserId().equals(userId) && dto.getPassword().equals(password)) {
//			return dto;
//		}
//		return null;
//	}
//	
	
	
	@Override
	public SignUpDto findByIdAndPassword(String userId, String password) {
		
		SignUpEntity entity = this.signUpRepository.findByIdAndPassword(userId);
		
		SignUpDto dto = new SignUpDto();
		BeanUtils.copyProperties(entity, dto);
		
		log.info("matching----" + passwordEncoder.matches(password, entity.getPassword()));

		if (dto.getUserId().equals(userId) && passwordEncoder.matches(password, entity.getPassword())) {
			return dto;
		}
		else {
			return null;
		}
		
	}
	
	
	
	
	
	
	
		
	
	@Override
	public boolean sendMail(String email) {
		String portNumber = "587";  //485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "rudraproject26@outlook.com";
		String password = "rudra@2026";
		String to = email;
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.debug", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.ssl.trust", "smtp.office365.com");
		prop.put("mail.transport.protocol", "smtp");
		
		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration completed");
			message.setText("Thanks for Registering!!!");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent successfully");
		}catch(MessagingException e) {
			e.printStackTrace();
		}
		
		
		
		return true;
	}

}
	

