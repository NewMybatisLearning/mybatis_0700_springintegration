package com.ymd.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymd.learn.mapper.UserMapper;
import com.ymd.learn.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		return this.userMapper.getUserById(id);
	}
	
}
