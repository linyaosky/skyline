package com.skyline.innofarms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skyline.innofarms.domain.barn;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=ApplicationTest.class)
public class ApplicationTest {
	
	@Autowired
	private barn barnMapper;
	
	@Test
	@Rollback
	public void testFindByName(){
		
	}
	
}
