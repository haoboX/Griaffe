package com.Griaffe.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Griaffe.pojo.Praise;

@Component
public interface PraiseMapper {

	public void insertPraise(Praise praise) ;
	public ArrayList<Praise> queryPraise(Praise praise);
	public void deletePraise(Praise praise);
	public void updatePraise(Praise praise);
	
}
