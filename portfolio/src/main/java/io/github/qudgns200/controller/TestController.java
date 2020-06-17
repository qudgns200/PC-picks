package io.github.qudgns200.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController : REST(Representational State Transfer) 서비스를 제공하기 위한 컨트롤러를 지정하는 어노테이션
// @GetMapping : GET 요청을 받기 위한 Mapping 어노테이션(PostMapping, DeleteMapping, PutMapping 등)

@RestController
public class TestController {
	@GetMapping(path="/hello")
	public String HelloSpringWorld() {
		return "Hello, SPRING";
	}
}
