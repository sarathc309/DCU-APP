package com.banking.app.dcu;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.banking.app.dcu.model.UserInfo;

public class UserInfoRepoTest {
	@PersistenceContext
	EntityManager manager;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void contextLoads() {
	
	UserInfo info=manager.find(UserInfo.class, 10510);	
		
	logger.info("Testing eager fetching default", info);
		
	}
}
