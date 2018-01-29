package com.ssm.service;

import java.util.List;

import com.ssm.entity.School;

public interface SchoolServiceImp {

	List<School> selAll();
	int addSchool(School o);
}