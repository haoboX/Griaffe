package com.Griaffe.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Griaffe.pojo.Follow;

@Component
public interface FollowMapper {

	public void insertfollow(Follow follow) ;
	public ArrayList<Follow> queryfollow(Follow follow);
	public void deletefollow(Follow follow);
	public void updatefollow(Follow follow);
	
}
