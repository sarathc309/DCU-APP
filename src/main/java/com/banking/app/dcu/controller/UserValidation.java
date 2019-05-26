package com.banking.app.dcu.controller;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.banking.app.dcu.dao.AccountTypeRepo;
import com.banking.app.dcu.dao.UserRepo;
import com.banking.app.dcu.model.CustomAccount;
import com.banking.app.dcu.model.UserAccount;
import com.banking.app.dcu.model.UserInfo;
import com.banking.app.dcu.model.Users;

@Repository
@Controller
@SessionAttributes("user_info")
public class UserValidation 
{
@Autowired
private UserRepo repo;

@Autowired
private AccountTypeRepo account_repo;

@RequestMapping(value="validate",method= RequestMethod.POST)
public String validateUser(@Valid @ModelAttribute("user") Users user, 
		BindingResult thebindingresult, //@ModelAttribute("user_info")UserInfo info,
		final RedirectAttributes attributes,Model model)//
{
	
	String uname=user.getUser_name();
	String pwd=user.getPassword();
	
	if(!thebindingresult.hasErrors())
	{     
		List<Users> list=repo.findByName(uname, pwd);
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getUser_name().equals(uname)&&list.get(i).getPassword().equals(pwd))
			{
				
				List<CustomAccount> acct_list= new ArrayList<CustomAccount>();
				
				acct_list=account_repo.accountDetails(list.get(i));
			
				
				if(acct_list.size()!=0)
					
				{
					model.addAttribute("account_list",acct_list);
					
					return "AccountInfo";
				}
				
				else
				{
				
				Users users=repo.findUserDetails(list.get(i).getUid());
				
				UserInfo info=repo.findUserInfo(list.get(i).getUid());
				
				//attributes.addFlashAttribute("user_info", info);
				model.addAttribute("user_info", users);
				model.addAttribute("Firstname", info.getFirst_name());
				model.addAttribute("Lastname", info.getLast_name());
				return "Welcome";
				
				
				}
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               		model.addAttribute("errorMessage", "UserName or password do not Match our Records");
		return "Login";
	}
	else
	{
		model.addAttribute("errorMessage", "Please enter valid Username and Password");
	return "Login";
	}
}
}