package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.FollowMapper;
import com.Griaffe.pojo.Follow;

@Service
public class FollowService {

	public FollowService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private FollowMapper mapper;
	
	public void addFollow(Follow follow) {
		mapper.insertfollow(follow);
	}
	
	public void deleteFollow(Follow follow) {
		mapper.deletefollow(follow);
	}
	
	public ArrayList<Follow> selectFollow(Follow follow){
		return mapper.queryfollow(follow);
	}
	
	public void updateFollow(Follow follow) {
		mapper.updatefollow(follow);
	}

	
	
	
}
