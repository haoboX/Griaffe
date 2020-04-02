package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.DarkroomMapper;
import com.Griaffe.pojo.Darkroom;

@Service
public class DarkroomService {

	public DarkroomService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private DarkroomMapper mapper;
	
	public void addDarkroom(Darkroom darkroom) {
		mapper.insertDarkroom(darkroom);
	}
	
	public void deleteDarkroom(Darkroom darkroom) {
		mapper.deleteDarkroom(darkroom);
	}
	
	public ArrayList<Darkroom> selectDarkroom(Darkroom darkroom){
		return mapper.queryDarkroom(darkroom);
	}
	
	public void updateDarkroom(Darkroom darkroom) {
		mapper.updateDarkroom(darkroom);
	}
}
