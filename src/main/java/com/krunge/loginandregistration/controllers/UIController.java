package com.krunge.loginandregistration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.krunge.loginandregistration.models.LoginUser;
import com.krunge.loginandregistration.models.User;

@Controller
public class UIController {
	@GetMapping("/")
	public String rLoginReg (
//			@ModelAttribute("user") User user, 
//			@ModelAttribute("loginUser") LoginUser loginUser
			){
		return "login.jsp";
	}
}