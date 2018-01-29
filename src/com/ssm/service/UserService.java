package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserDaoImp;
import com.ssm.entity.User;

@Service("userService")
public class UserService implements UserServiceImp {
	UserDaoImp dao;

	/* (non-Javadoc)
	 * @see com.ssm.service.UserServiceImp#getDao()
	 */
	@Override
	public UserDaoImp getDao() {
		return dao;
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.UserServiceImp#setDao(com.ssm.dao.UserDaoImp)
	 */
	@Override
	@Resource(name="userDao")
	public void setDao(UserDaoImp dao) {
		this.dao = dao;
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.UserServiceImp#addUser(com.ssm.entity.User)
	 */
	@Override
	public int addUser(User user){
		return dao.insert(user);
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.UserServiceImp#selByUser(int)
	 */
	@Override
	public User selByUser(int id){
		return dao.selectById(id);
	}
	public List<User> selAll(){
		return dao.selectAll();
	}
}
