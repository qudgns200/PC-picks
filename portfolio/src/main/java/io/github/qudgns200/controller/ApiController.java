package io.github.qudgns200.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.qudgns200.model.User;
import io.github.qudgns200.service.UserService;

@CrossOrigin(origins = "*") // Cross-Origin Resource Sharing 요청 처리를 위함
@RestController
public class ApiController {
	
	@Autowired
	private UserService uService;
	
	// User 정보 가져오기
	@RequestMapping(value="/User/1", method= {RequestMethod.GET})
	public User getUser(String email) {
		User user = new User();
		user = uService.getUesrInfo(email);
		return user;
	}
}
