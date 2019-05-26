package com.banking.app.dcu.model;

import java.util.LinkedHashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class RegisterCustom {

	
	
private	 LinkedHashMap<String,String> acct_cd;


@Autowired
private UserAccount account;
@Autowired
private AccountBalance balance;

public UserAccount getAccount() {
	return account;
}

public void setAccount(UserAccount account) {
	this.account = account;
}

public AccountBalance getBalance() {
	return balance;
}

public void setBalance(AccountBalance balance) {
	this.balance = balance;
}

public LinkedHashMap<String, String> getAcct_cd() {
	return acct_cd;
}

//public void setAcct_cd(LinkedHashMap<String, String> acct_cd) {
//	this.acct_cd = acct_cd;
//}


//public RegisterCustom(UserAccount account, AccountBalance balance) {
//	super();
//	this.account = account;
//	this.balance = balance;
//}


public RegisterCustom(LinkedHashMap<String, String> acct_cd)
{
	this.acct_cd=acct_cd;
	
}
	
	
}
