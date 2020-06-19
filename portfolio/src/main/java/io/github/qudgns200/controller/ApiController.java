package io.github.qudgns200.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.qudgns200.model.User;

@CrossOrigin(origins = "*") // Cross-Origin Resource Sharing 요청 처리를 위함
@RestController
public class ApiController {	
	
	@RequestMapping("/Hello")
	public User hello() {
		User p = new User();
		return p;
	}
}
