package com.lhd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.common.Result;
import com.lhd.entity.UsersTable;
import com.lhd.service.UserService;
import com.lhd.untils.Md5Untils;

@Controller
@RequestMapping("/Login")
public class LoginController {
	
	@Autowired
	private UserService userService;
	UsersTable users = new UsersTable() ;
/*	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	@ResponseBody
	public Result adminLogin (@RequestBody UsersTable user) {
		users.setUsername(user.getUsername());
		users.setPassword( Md5Untils.stringMD5(user.getPassword()) );
		UsersTable loginUser = userService.loginUser(users) ;
		if ( null != loginUser ) {
			return new Result(1, "成功", loginUser) ;
		} else {
			return new Result(0,"用户或者密码错误") ;
		}
	}*/
	
	@RequestMapping("/login")
	public String login () {
		return "Login";
	}
	
	
	@RequestMapping("/user")
	public String User () {
		return "redirect:/admin/page/user/userInfo.html";
	}
	
	
}
