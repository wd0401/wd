package com.snoopy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.snoopy.dao.UsersDao;
import com.snoopy.po.Users;
import com.snoopy.service.UsersService;
@Service
@Transactional(readOnly=true)
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDao usersDao;
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return this.usersDao.findAll();
	}

	@Override
	public void save(Users users) {
		this.usersDao.save(users);
		
	}

	@Override
	public Users findById(int id) {
		// TODO Auto-generated method stub
		return this.usersDao.findById(id);
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		this.usersDao.update(users);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
