package com.banking.app.dcu.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.app.dcu.dao.RegisterRepo;
import com.banking.app.dcu.dao.UserRepo;
import com.banking.app.dcu.dao.ValidateUser;
import com.banking.app.dcu.model.UserInfo;
import com.banking.app.dcu.model.Users;
@Controller
public class RegisterController {
@Autowired	
private Users users;
@Autowired
private UserInfo userinfo;
	
//@Autowired
//private RegisterCustom register;
	
@Autowired
private RegisterRepo registerRepo;

@Autowired
private UserRepo userRepo;

@Autowired
private ValidateUser validateRepo;
	
@RequestMapping(value="register")	
public String	registerController(Model model)
{
	model.addAttribute("personal_info", userinfo);
	model.addAttribute("user_info", users);
	//model.addAttribute("register",register);
	System.out.println("Inside Register Controller");
	return "Register";
}

@RequestMapping(value="registerform",method= RequestMethod.POST)
public String validateRegisterForm(@Valid @ModelAttribute("user_info")Users user, BindingResult userinfo_result,
		                           @Valid @ModelAttribute("personal_info")UserInfo info,BindingResult personalinfo_result,Model model)
{
	
	if(userinfo_result.hasErrors() || personalinfo_result.hasErrors() )
	{
		 System.out.println("Inside  error and returning to register page ");
		model.addAttribute("message","Errors exist in form validation");
		return "Register";
	}
	
	else
	{
		registerRepo.registerUser(user, info);
		
		
		
		if(validateRepo.valdateUser(info.getUsers().getUid()).getFirst_name().equals(info.getFirst_name()))
		{
			model.addAttribute("name",info.getFirst_name()+" "+info.getLast_name());
			return "Registration_Success";
		}
		 
		else
		{
	
			model.addAttribute("Error","Error occured while adding User please try again");
		 return "error";
	}
}
}
}