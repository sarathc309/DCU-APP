package com.banking.app.dcu;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.banking.app.dcu.model.UserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DcuBankApplicationTests {

	@PersistenceContext
	EntityManager manager;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void contextLoads() {
	
	UserInfo info=manager.find(UserInfo.class, 10510);	
		
	logger.info("Testing eager fetching default", info.toString());
	logger.info("Testing eager fetching default", info.getUsers());
		
	}

}
