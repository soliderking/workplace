package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.SchoolDaoImp;
import com.ssm.entity.School;

@Service("schoolService")
public class SchoolService implements SchoolServiceImp {
	SchoolDaoImp dao;

	public SchoolDaoImp getDao() {
		return dao;
	}
	@Resource(name="schoolDao")
	public void setDao(SchoolDaoImp dao) {
		this.dao = dao;
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.SchoolServiceImp#selAll()
	 */
	@Override
	public List<School> selAll(){
		return dao.selectAll();
	}
	public int addSchool(School o){
		return dao.insert(o);
	}
}
