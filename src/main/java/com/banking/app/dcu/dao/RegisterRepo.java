package com.banking.app.dcu.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.banking.app.dcu.model.UserInfo;
import com.banking.app.dcu.model.Users;

@Repository
@Transactional
public class RegisterRepo {
	
@PersistenceContext
EntityManager manager;

public void registerUser(Users user,UserInfo info)
{

	manager.persist(user);
	info.setUsers(user);
	//user.setInfo(info);
    manager.persist(info);
   

}
}