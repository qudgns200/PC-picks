package io.github.qudgns200.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.qudgns200.model.Image;
import io.github.qudgns200.model.User;
import io.github.qudgns200.service.ImageService;
import io.github.qudgns200.service.UserService;

@CrossOrigin(origins = "*") // Cross-Origin Resource Sharing 요청 처리를 위함
@RestController
public class ApiController {
	
	@Autowired
	private UserService uService;
	@Autowired
	private ImageService iService;
	
	// User 정보 가져오기
	@RequestMapping(value="/user/{email}")
	public User getUser(@PathVariable String email) {
		User user = new User();
		user = uService.getUesrInfo(email);
		return user;
	}
	
	// Image 정보 insert 하기
	@PostMapping(value="/image")
	public int setImage(MultipartHttpServletRequest request) throws IOException {
		Image image = new Image();
		image.setEmail(request.getParameter("email"));
		image.setTitle(request.getParameter("title"));
		image.setDesc(request.getParameter("desc"));
		MultipartFile file = request.getFile("uploadImage");
		image.setUploadImage(file);
		
		return iService.setImageInfo(image);
	}
}
