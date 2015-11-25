package com.solomon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(String name, String password) {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/sign")
	public ModelAndView sign() {
		System.out.println("登陆成功");
		return new ModelAndView("index");
	}
	
}
