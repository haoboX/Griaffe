package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.UserMapper;
import com.Griaffe.pojo.User;

@Service
public class UserService {

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private UserMapper mapper;
	public void addUser(User user) {
		mapper.insertUser(user);
	}
	
	public void deleteUser(User user) {
		mapper.deleteUser(user);
	}
	
	public ArrayList<User> selectUser (User user) {
		return	mapper.queryUser(user);
	}
	
	public void updateUser(User user) {
		mapper.updateUser(user);
	}
	
	
}
