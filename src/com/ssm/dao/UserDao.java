package com.ssm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssm.entity.User;

@Repository("userDao")
public class UserDao implements UserDaoImp {
	
	UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Resource(name="userMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	/* (non-Javadoc)
	 * @see com.ssm.dao.UserDaoImp#insert(com.ssm.entity.User)
	 */
	@Override
	public int insert(User user){
		return userMapper.save(user);
	}
	/* (non-Javadoc)
	 * @see com.ssm.dao.UserDaoImp#selectById(int)
	 */
	@Override
	public User selectById(int id){
		return userMapper.selectById(id);
	}
	public List<User> selectAll(){
		return userMapper.selectAll();
	}

}
