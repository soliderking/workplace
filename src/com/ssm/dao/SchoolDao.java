package com.ssm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.ssm.entity.School;

@Repository("schoolDao")
public class SchoolDao implements SchoolDaoImp {
	SchoolMapper mapper;

	public SchoolMapper getMapper() {
		return mapper;
	}
	@Resource(name="schoolMapper")
	public void setMapper(SchoolMapper mapper) {
		this.mapper = mapper;
	}
	public int insert(School o){
		return mapper.save(o);
	}
	/* (non-Javadoc)
	 * @see com.ssm.dao.SchoolDaoImp#selectAll()
	 */
	@Override
	public List<School> selectAll(){
		return mapper.selectAll();
	}
}
