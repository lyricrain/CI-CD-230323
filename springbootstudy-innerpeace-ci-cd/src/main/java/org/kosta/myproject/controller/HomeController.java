package org.kosta.myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "hello springboot innerpeace aws docker jenkins github build";
	}
}
