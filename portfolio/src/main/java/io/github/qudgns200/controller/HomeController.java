package io.github.qudgns200.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	
	@RequestMapping(value = "/home")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping(value = "/homeStr")
	public String homeStr() {
		System.out.println("들어옴");
		return "index.html";
	}
}
