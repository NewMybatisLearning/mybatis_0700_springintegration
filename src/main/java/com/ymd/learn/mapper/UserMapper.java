package com.ymd.learn.mapper;

import org.springframework.stereotype.Repository;

import com.ymd.learn.model.User;

@Repository
public interface UserMapper {

	public User getUserById(int userId);

	public void updateUserById(User user);

	public void insertUser(User user);
	
}	
