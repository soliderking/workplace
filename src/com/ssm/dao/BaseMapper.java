package com.ssm.dao;

import java.util.List;

import com.ssm.entity.User;

public interface BaseMapper<T,K> {
	public int save(T o);
	public int delete(K id);
	public int update(T o);
	public T selectById(K id);
	public List<T> selectAll();
}
