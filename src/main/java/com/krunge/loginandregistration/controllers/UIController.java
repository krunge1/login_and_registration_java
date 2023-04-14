package com.krunge.loginandregistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.krunge.loginandregistration.models.LoginUser;
import com.krunge.loginandregistration.models.User;
import com.krunge.loginandregistration.services.UserService;

@Controller
public class UIController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String rLoginReg (
			@ModelAttribute("user") User user, 
			@ModelAttribute("loginUser") LoginUser loginUser
			){
		return "login.jsp";
	}
}