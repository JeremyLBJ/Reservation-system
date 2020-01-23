package com.lhd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lhd.common.Result;
import com.lhd.entity.UsersTable;
import com.lhd.service.UserService;
import com.lhd.untils.Md5Untils;

@Controller
@RequestMapping("/Login")
@SessionAttributes("loginUser")
public class LoginController {
	
	@Autowired
	private UserService userService;
	UsersTable users = new UsersTable() ;
	//  ${loginUser == null ? 'Hi,请登录' : '欢迎:'.concat(loginUser.cnName)}
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	@ResponseBody
	public Result adminLogin (@RequestBody UsersTable user , Model model) {
		users.setUsername(user.getUsername());
		users.setPassword( Md5Untils.stringMD5(user.getPassword()) );
		UsersTable loginUser = userService.loginUser(users) ;
		if ( null != loginUser ) {
			model.addAttribute("loginUser", loginUser) ;
			return new Result(1, "成功", loginUser) ;
		} else {
			return new Result(0,"用户或者密码错误") ;
		}
	}
	
	@RequestMapping("/login")
	
	public String login () {
		return "Login";
	}
	
	
	@RequestMapping("/user")
	public String User () {
		return "redirect:/admin/page/user/userInfo.html";
	}
	
	
}
