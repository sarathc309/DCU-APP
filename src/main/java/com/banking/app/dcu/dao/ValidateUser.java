package com.banking.app.dcu.dao;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.banking.app.dcu.model.UserInfo;
import com.banking.app.dcu.model.Users;
@Component
@Transactional
public class ValidateUser {
@Autowired	
EntityManager manager;	

@Autowired
private Users user;

@Autowired
private UserInfo info;


public UserInfo valdateUser(Integer id)
{
//user=	manager.find(Users.class, id);
	 info=manager.find(UserInfo.class, id);
	//System.out.println(user.getInfo());
	System.out.println(info.getFirst_name());
	System.out.println(info.getLast_name());
	return info;
}	
}