package com.yuyue.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuyue.dao.UserDao;
import com.yuyue.entity.User;
import com.yuyue.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserDao ud;
	@Override
	public void register(User user) throws Exception {
		ud.addUser(user);
		return ;
	}
	
	
	

}
