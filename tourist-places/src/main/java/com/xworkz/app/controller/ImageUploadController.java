package com.xworkz.app.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ImageUploadController {

	public ImageUploadController() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping("/upload")
	public String onUpload(@RequestParam("pic") MultipartFile multipartFile, Model model) throws IOException {
		
		log.info("multipart" + multipartFile);
		log.info("multipart" + multipartFile.getOriginalFilename());
		log.info("multipart" + multipartFile.getContentType());
		log.info("multipart" + multipartFile.getSize());
		log.info("multipart" + multipartFile.getBytes());
		
		
		if(multipartFile.isEmpty()) {
			log.info("File not found, select the file");
			model.addAttribute("errorMessage", "Please select the file");
			return "uploadImage";
		}
		
		model.addAttribute("successMessage", "File is Successfully Uploaded");
		
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\Tourist-places\\" + multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		
		return "uploadImage";	
	}
	
	
	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName) throws IOException {
		response.setContentType("image/jpg");
		File file = new File("D:\\Tourist-places\\" + fileName);
		//files into bytes--->response
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
		
	}
	
	
	
	
	
	
	
	
	
}
