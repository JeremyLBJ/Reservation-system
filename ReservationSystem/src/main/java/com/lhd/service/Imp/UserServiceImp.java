package com.lhd.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhd.dao.UserMapper;
import com.lhd.entity.User;
import com.lhd.entity.UserExample;
import com.lhd.service.UserService;
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	//查询所有用户
	public List<User> findAll() {
		List<User> list = userMapper.selectByExample(null);
		return list;
	}
	//用户注册
	@Override
	@Transactional
	public int registUser(User user) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername())
		.andPassworldEqualTo(user.getPassworld()).andCreatetimeEqualTo(user.getCreatetime());
		int i = userMapper.insert(user);
		return i;
	}

	//用户登录
	@Override
	public User loginUser(User user) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername())
		.andPassworldEqualTo(user.getPassworld());
		List<User> list = userMapper.selectByExample(example);
		if( list.size() > 0 ) {
			return list.get(0);
		}
		return null;
	}
	
}
