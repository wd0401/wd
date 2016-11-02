package com.snoopy.service;

import java.util.List;

import com.snoopy.po.Users;

public interface UsersService {
	
	List<Users> findAll();
	
	void save(Users users);
	
	Users findById(int id);
	
	void update(Users users);
	
	void deleteById(int id);
}
