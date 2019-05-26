package com.banking.app.dcu.dao;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AccountNumberSequence {

	@Autowired
@Transient	
@PersistenceContext	
EntityManager manager;	
	

	public String getSeqNextVal()
	{
		
		Query q=manager.createNativeQuery("select acct_num.nextval from DUAL");
		
		BigInteger result=(BigInteger) q.getSingleResult();
		return result.toString();
	
	}	
	
	
	
	
	
}
