package com.banking.app.dcu.controller;
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
import com.banking.app.dcu.dao.UserRepo;
import com.banking.app.dcu.model.Users;
@Repository
@Controller
public class UserValidation {

@Autowired
private UserRepo repo;




@RequestMapping(value="validate",method= RequestMethod.POST)
public String validateUser(@Valid @ModelAttribute("user") Users user, BindingResult thebindingresult,Model model)
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
				model.addAttribute("name", uname);

				return "Welcome";
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
