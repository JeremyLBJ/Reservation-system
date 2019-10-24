package com.lhd.service;

import java.util.List;

import com.lhd.entity.User;

public interface UserService {
	//查询所有
	List<User> findAll();
	//用户注册
	int registUser(User user);
	//用户登录
	User loginUser(User user);

}
