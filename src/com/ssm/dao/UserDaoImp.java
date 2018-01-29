package com.ssm.dao;

import java.util.List;

import com.ssm.entity.User;

public interface UserDaoImp {

	int insert(User user);

	User selectById(int id);
	List<User> selectAll();
}