package io.github.qudgns200.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.qudgns200.model.Home;

// @RestController : REST(Representational State Transfer) 서비스를 제공하기 위한 컨트롤러를 지정하는 어노테이션
// @GetMapping : GET 요청을 받기 위한 Mapping 어노테이션(PostMapping, DeleteMapping, PutMapping 등)
// ResponseEntity : REST 방식을 구현하는 객체

@RestController
public class TestController {
	
	@GetMapping(path="/get")
	public ResponseEntity HelloSpringWorld(@RequestParam("name") String name,
										   @RequestParam("age") String age) {
		Home home = new Home();
		home.setName(name);
		home.setAge(Integer.parseInt(age));

		return ResponseEntity.ok(home);
	}
}
