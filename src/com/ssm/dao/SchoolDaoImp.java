package com.ssm.dao;

import java.util.List;

import com.ssm.entity.School;

public interface SchoolDaoImp {
	int insert(School o);
	List<School> selectAll();

}