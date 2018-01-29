package com.ssm.dao;

import org.springframework.stereotype.Component;

import com.ssm.entity.School;
@Component("schoolMapper")
public interface SchoolMapper  extends BaseMapper<School,Integer>{

}
