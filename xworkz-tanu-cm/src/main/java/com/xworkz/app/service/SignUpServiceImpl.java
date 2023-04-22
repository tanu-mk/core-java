package com.xworkz.app.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
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
import com.xworkz.app.entity.TechnologyEntity;
import com.xworkz.app.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService  {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	String resetPassword = DefaultPasswordGenerator.generate(6);
	
	
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
			entity.setPasswordChangedTime(LocalTime.of(0, 0, 0));
			entity.setResetPassword(false);
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
	
//	for SignIn
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
	public SignUpDto userSignIn(String userId, String password) {
		SignUpEntity entity = this.signUpRepository.userSignIn(userId);
		SignUpDto dto = new SignUpDto();
		BeanUtils.copyProperties(entity, dto);
		
		log.info("matching--" + passwordEncoder.matches(password, entity.getPassword()));
		log.info("Time matching--" + entity.getPasswordChangedTime().isAfter(LocalTime.now()));
		log.info("Now Present Time--" + LocalTime.now());
		log.info("PasswordChangedTime--" + entity.getPasswordChangedTime());

		log.info("Time " + LocalTime.now().isBefore(entity.getPasswordChangedTime()));
		if (entity.getLockCount() >= 3) {
			log.info("Running in Login count condition");
			return dto;
		}

			if (dto.getUserId().equals(userId) && passwordEncoder.matches(password, entity.getPassword())) {
			log.info("Running userId matching and password matching");
			return dto;
		}  else {
			this.signUpRepository.onLock(userId, entity.getLockCount() + 1);
			log.info("count of login" + entity.getLockCount() + 1);
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

	
	
	
	@Override
	public SignUpDto resetPassword(String email) {
		log.info("Reset Password " + resetPassword);
		
		SignUpEntity entity = this.signUpRepository.resetPassword(email);
		if(entity != null) {
			log.info("entity found in email " + email);
			entity.setPassword(passwordEncoder.encode(resetPassword));
			entity.setUpdatedBy("System");
			entity.setUpdatedDate(LocalDateTime.now());
			entity.setLockCount(0);
			entity.setResetPassword(true);
			entity.setPasswordChangedTime(LocalTime.now().plusSeconds(120));
			boolean update = this.signUpRepository.update(entity);
			if(update) {
				sendMail(entity.getEmail(), "Your reset password is "+ resetPassword);
			}
			log.info("Updated---" + update);
			SignUpDto updatedDto = new SignUpDto();
			BeanUtils.copyProperties(entity, updatedDto);
			
			return updatedDto;
		}
		log.info("Email not found for email " + email);
		return SignUpService.super.resetPassword(email);
	}
	
	
	
	
	@Override
	public SignUpDto updatePassword(String userId, String password, String confirmPassword) {
		
		SignUpEntity entity = new SignUpEntity();
		
		if(password.equals(confirmPassword)) {
			
			boolean passwordUpdated = this.signUpRepository.updatePassword(userId, passwordEncoder.encode(password), false, LocalTime.of(0,0,0));
			log.info("passwordUpdated " + passwordUpdated);
		}
		return SignUpService.super.updatePassword(userId, password, confirmPassword);
	}
	
	
	@Override
	public SignUpDto updateProfile(String userId, String email, Long mobileNumber, String imagePath) {
		log.info("Inside update profile method");
		
			SignUpEntity upEntity = this.signUpRepository.resetPassword(email);
			log.info("userId: " + userId + "email: " + email + "mobile: " + mobileNumber + "image name: "+ 										imagePath);

			upEntity.setUserId(userId);
			upEntity.setMobileNumber(mobileNumber);
			upEntity.setPicName(imagePath);
			boolean updated = this.signUpRepository.update(upEntity);
			log.info("updated--" + updated);
			return SignUpService.super.updateProfile(userId, email, mobileNumber, imagePath);
		}
	
	
	@Override
	public boolean sendMail(String email, String text) {
		
		String portNumber = "587";  //485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "rudraproject26@outlook.com";
		String password = "rudra@2026";
		String to = email;
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.debug", "true");
		prop.put("mail.smtp.auth", "true");
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
			//message.setText("Thanks for Registering!!!");
			message.setText(text);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent successfully");
		}catch(MessagingException e) {
			e.printStackTrace();
		}
	return true;
	}

	
		
	public final static class DefaultPasswordGenerator {
		private static final String[] charCategories = new String[] { "abcdefghijklmnopqrstuvwxyz",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789" };

		public static String generate(int length) {
			StringBuilder password = new StringBuilder(length);
			Random random = new Random(System.nanoTime());

			for (int i = 0; i < length; i++) {
				String charCategory = charCategories[random.nextInt(charCategories.length)];
				int position = random.nextInt(charCategory.length());
				password.append(charCategory.charAt(position));
			}

			return new String(password);
		}
//		String password = DefaultPasswordGenerator.generate(6);[use this reference to generate the password]
	}
	
		
	
	@Override
	public SignUpDto addTechnology(String userId, TechnologyEntity technologyEntity) {
		
		log.info("Running addTechnology in service impl");
		
		SignUpEntity signUpEntity = this.signUpRepository.userSignIn(userId);
		technologyEntity.setCreatedBy(userId);
		technologyEntity.setSignUpEntity(signUpEntity);
		log.info("accessing entity" + signUpEntity);
		
		boolean saved = this.signUpRepository.saveTechnology(technologyEntity);
		log.info("Technologies saved in database" + saved);
		
		
		return SignUpService.super.addTechnology(userId, technologyEntity);
	}
	
	
	@Override
	public List<TechnologyEntity> viewTechnology(String userId) {
		
		log.info("Running view Technology in service imple");
		SignUpEntity signUpEntity = this.signUpRepository.userSignIn(userId);
		List<TechnologyEntity> technology = signUpEntity.getTechnology();
		log.info("Getting technologies as per userId : "+userId+" : "+technology);
		
		return technology;
	}
	
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

