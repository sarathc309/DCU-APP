package com.banking.app.dcu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.banking.app.dcu.model.UserInfo;
import com.banking.app.dcu.model.Users;

@Component
//@Repository
@Transactional
public class UserRepo {

@PersistenceContext
EntityManager manager;
	
public List<Users> findByName(String name, String password )
{
	List<Users> list= manager.createQuery("select u from Users u where user_name="+"'"+name+"'" + " and password="+"'"+password+"'" ).getResultList();
	manager.close();
	return list;
}

public UserInfo findUserInfo(Integer uid)
{
	
UserInfo info= manager.find(UserInfo.class, uid);
	return info;
}



public Users findUserDetails(Integer uid)
{
	Users user=manager.find(Users.class, uid);

return user;
}

	
}
