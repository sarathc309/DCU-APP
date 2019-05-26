package com.banking.app.dcu.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.banking.app.dcu.model.AccountBalance;
import com.banking.app.dcu.model.UserAccount;

@Component
@Transactional
public class UserAccountRepo {

@PersistenceContext	
EntityManager manager;	
	
	
public void createUserAccount(UserAccount account,AccountBalance balance )
{
	manager.persist(account);
	balance.setUseraccount(account);
    manager.persist(balance);
    System.out.println("Success");
	
}
}