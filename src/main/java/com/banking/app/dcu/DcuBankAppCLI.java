package com.banking.app.dcu;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banking.app.dcu.dao.AccountNumberSequence;
import com.banking.app.dcu.dao.RegisterRepo;
import com.banking.app.dcu.model.UserAccount;

//@SpringBootApplication
public class DcuBankAppCLI implements CommandLineRunner{
	
	@Autowired
	AccountNumberSequence repo;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DcuBankAppCLI.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("First sequence value is");
//		System.out.println(repo.getSeqNextVal());
//		System.out.println("Second sequence value is");
//		System.out.println(repo.getSeqNextVal());
		
		UserAccount act= new UserAccount();
		act.setIs_account_active("Yes");
		//act.setAccount_no("SAV");
		System.out.println(act.getAccount_no());
		
		System.out.println(act.getIs_account_active());
		
	}

}
