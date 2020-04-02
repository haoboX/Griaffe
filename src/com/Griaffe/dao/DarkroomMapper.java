package com.Griaffe.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Griaffe.pojo.Darkroom;

@Component
public interface DarkroomMapper {

	public void insertDarkroom(Darkroom darkroom) ;
	public ArrayList<Darkroom> queryDarkroom(Darkroom darkroom);
	public void deleteDarkroom(Darkroom darkroom);
	public void updateDarkroom(Darkroom darkroom);
	
}
