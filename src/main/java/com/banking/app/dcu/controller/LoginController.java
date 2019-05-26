package com.banking.app.dcu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banking.app.dcu.model.UserInfo;
import com.banking.app.dcu.model.Users;
@Controller
public class LoginController {
@Autowired
	private Users user;
	
//@Autowired 
//private UserInfo user_info;
	@RequestMapping(value="/")
	public String LoginPage(Model model)
	{
		System.out.println("Inside Login Controller");
		model.addAttribute("user", user);
		//model.addAttribute("user_info", user_info);
		return "Login";
	}
}
