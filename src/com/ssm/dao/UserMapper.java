package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ssm.entity.User;
@Component("userMapper")
public interface UserMapper extends BaseMapper<User,Integer>{
	
}
