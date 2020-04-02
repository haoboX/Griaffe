package com.Griaffe.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Griaffe.pojo.User;

@Component
public interface UserMapper {

	public void insertUser(User user) ;
	public ArrayList<User> queryUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
}
