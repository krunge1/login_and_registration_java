package com.krunge.loginandregistration.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.krunge.loginandregistration.models.LoginUser;
import com.krunge.loginandregistration.models.User;
import com.krunge.loginandregistration.services.UserService;

@Controller
public class UIController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String rLoginReg (
			Model model
			){
		model.addAttribute("user", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "login.jsp";
	}
	
	@GetMapping("/logout")
		public String pLogout(HttpSession session) {
			session.setAttribute("userId", null);
			return "redirect:/";
		}
	
	@GetMapping("/dashboard")
	public String rDashboard(Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if(userId==null) {
			return "redirect:/";
		}
		User user = userService.getOne(userId);
		model.addAttribute("user", user);
		return "show.jsp";
	}
}