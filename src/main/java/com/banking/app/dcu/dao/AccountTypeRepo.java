package com.banking.app.dcu.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.banking.app.dcu.model.Account;
import com.banking.app.dcu.model.CustomAccount;
import com.banking.app.dcu.model.UserAccount;
import com.banking.app.dcu.model.Users;


@Component
@Transactional
public class AccountTypeRepo {

@Autowired	
@PersistenceContext
EntityManager manager;

private boolean result;


public List<Account> getBankAccountNames()
{
	
//	manager=new EntityManager();
//	System.out.println("Inside getBankAccountNames Method");
//	
//	System.out.println(manager);
	
	List<Account> accountlist = manager.createQuery("select a from Account a").getResultList();
	
	return accountlist;
}
	
	public AccountTypeRepo()
	{
		System.out.println("Inside AccountTypeRepo Constructor");
	}
	
public boolean checkIfAccountExists(String acct_cd,Users user)
{
	
	   //result=true;
List<UserAccount> accountlist=manager.createQuery("select a from UserAccount a where USERS_UID="+user.getUid()).getResultList();
	   

System.out.println("acct_cd" + acct_cd +"Inside Check Function");

	   for(int i=0;i<accountlist.size();i++)
	   {
		   if(accountlist.get(i).getAcct_cd().equals(acct_cd))
		   {
			   System.out.println("Inside IFFFFFFFFFFFFF Condition"+ accountlist.get(i).getAcct_cd()+"  "+ acct_cd);
			   
			   return false;
		   }
	   }
	   
	
	return true ;
	
	
}
	
public List<CustomAccount> accountDetails(Users user)
{
	
	System.out.println();
	
	List<UserAccount> list= manager.createQuery("Select u from UserAccount u where users_uid="+user.getUid()).getResultList();
	
	List<CustomAccount> acct_list= new ArrayList<CustomAccount>();
	
	for(int i=0;i<list.size();i++)
	{
		
	acct_list.add(new CustomAccount(list.get(i).getAcct_cd(), list.get(i).getBalance().getBalance()));
		
	}
	
	
	
	return acct_list;
	
}





	
}
