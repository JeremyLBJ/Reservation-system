package com.lhd.user;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lhd.ReservationSystemAppliction;
import com.lhd.entity.User;
import com.lhd.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReservationSystemAppliction.class)
@MapperScan("com.lhd.dao")
public class UserTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void registUserTest() {
		User user = new User();
		user.setUsername("张三");
		user.setPassworld("123465aaa");
		user.setCreatetime(new Date());
		int i = userService.registUser(user);
		if( i > 0 ) {
			System.out.println("注册成功");
		}else {
			System.out.println("注册失败");
		}
	}

}
