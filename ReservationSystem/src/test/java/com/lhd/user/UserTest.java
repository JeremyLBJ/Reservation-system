package com.lhd.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.lhd.ReservationSystemAppliction;
import com.lhd.entity.UsersTable;
import com.lhd.service.UserService;
import com.lhd.untils.Md5Untils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReservationSystemAppliction.class)
@MapperScan("com.lhd.dao")
public class UserTest {
	
	@Autowired
	private UserService userService;
	private UsersTable user = new UsersTable();
	
	@Test
	public void registUserTest() {
		user.setUsername("刘某");
		user.setPassword(Md5Untils.stringMD5("123456"));
		int i = userService.registUser(user);
		if( i > 0 ) {
			System.out.println("注册成功");
		}else {
			System.out.println("注册失败");
		}
	}
	
	@Test
	public void loginUserTest() {
		user.setUsername("张三");
		user.setPassword(Md5Untils.stringMD5("123465a"));
		System.out.println(user.getPassword()+":::::passworld");
		UsersTable user2 = userService.loginUser(user);
		if( null != user2 ) {
			System.out.println(user2.getUsername()+"::::用户名");
		}else {
			System.out.println("未找到对应的用户");
		}
	}
	
}
