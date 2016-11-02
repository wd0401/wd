package com.snoopy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.snoopy.po.Users;

public interface UsersDao {
	List<Users> findAll();

	Users findById(Integer id);

	/**
	 * 如果 想使用 命名参数 则需要用@Param 进行声明
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	List<Users> findInfo(String username, @Param("password") String password);

	void save(Users users);
	
	void update(Users users);
	
	void deleteById(int id);
	
}
