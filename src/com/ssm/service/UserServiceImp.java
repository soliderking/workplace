package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import com.ssm.dao.UserDaoImp;
import com.ssm.entity.User;

public interface UserServiceImp {

	UserDaoImp getDao();

	void setDao(UserDaoImp dao);

	int addUser(User user);

	User selByUser(int id);
	List<User> selAll();
}