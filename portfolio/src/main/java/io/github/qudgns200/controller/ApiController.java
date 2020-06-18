package io.github.qudgns200.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.qudgns200.model.Person;

@RestController
public class ApiController {	
	
	@RequestMapping("/Hello")
	public Person hello() {
		Person p = new Person();
		p.setAge(18);
		p.setName("Lee");
		return p;
	}
}
