package com.thepustakari.springmvc.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thepustakari.springmvc.model.User;
import com.thepustakari.springmvc.model.Userlogin;
import com.thepustakari.springmvc.service.UserService;



@Controller
public class projectController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String loginPage() {
		return "login_page";	
		
	}

	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String homePage(@RequestParam Map<String, String> info, Model model) {
		Userlogin userlogin = new Userlogin();
		userlogin.setUsername(info.get("username"));
		userlogin.setPassword(info.get("password"));
		
		model.addAttribute("usernamepassword", userlogin.getUsername()+" "+userlogin.getPassword());
		return "home";
	}
	
	@RequestMapping(value="/account_register", method=RequestMethod.POST)
	public String addUser(@RequestParam Map<String, String> register, Model model) {
		return "account_register";
	}
		
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public String showAllUser(Model model) {
		
		model.addAttribute("users", userService.displayList());
		return "userList";
	}
	
	@RequestMapping(value="/user_save", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user, Model model, BindingResult result) {
		
		userService.saveUserAccount(user);
		
		return "redirect:/userList";
		
	}
	
	
}
