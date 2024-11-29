package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class Web02Application {

	public static void main(String[] args) {
		SpringApplication.run(Web02Application.class, args);
	}

	@RequestMapping("/")
	@ResponseBody // 뭐징 왜 이거 넣으니깐 됨?
	public String index() {
		return "Hello Spring";
	}

//	@RequestMapping("/hello1")
//	public String hello1() {
//		return "hello1";
//	}

	@RequestMapping("/hello1")
	public ModelAndView hello1() {
		// ModelAndView mav = new ModelAndView("hello1");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello1");
		return mav;
	}

	@RequestMapping("/hello2.do")
	public String hello2() {
		return "hello2";
	}
}
