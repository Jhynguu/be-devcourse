package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Web01Application {

	public static void main(String[] args) {
		SpringApplication.run(Web01Application.class, args);
	}

	@RequestMapping("/") // 요청
	public String index() {
		return "<b>Hello World</b>"; // 응답
	}

	// parameter
	//@RequestMapping("/hello1")
	// url
	@RequestMapping("/hello1.do")
	public String hello1() {
		return "<b>Hello1</b>";
	}

	@RequestMapping("/hello2.do")
	public String hello2() {
		return "<b>Hello2</b>";
	}
}
