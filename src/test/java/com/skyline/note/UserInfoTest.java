package com.skyline.note;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skyline.note.dao.UserInfoMapper;
import com.skyline.note.entity.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration
public class UserInfoTest {
	
	@Autowired
	private UserInfoMapper userMapper;
	
	@Test
	@Rollback
	public void insert(){
		UserInfo user = new UserInfo();
		user.setUserId(UUID.randomUUID().toString().replace("-", ""));
		user.setUserName("chendh");
		user.setRegisterTime(new Date());
		user.setRegisterIp(3.6);
		user.setPassword("123");
		userMapper.insert(user);
	}
}
