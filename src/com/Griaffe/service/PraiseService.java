package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.PraiseMapper;
import com.Griaffe.pojo.Praise;

@Service
public class PraiseService {

	@Autowired
	private PraiseMapper mapper;
	
	public void addPraise(Praise praise) {
		mapper.insertPraise(praise);
	}
	
	public void deletePraise(Praise praise) {
		mapper.deletePraise(praise);
	}
	
	public ArrayList<Praise> selectPraise(Praise praise){
		return mapper.queryPraise(praise);
	}
	
	public void updataPraise(Praise praise) {
		mapper.updatePraise(praise);
	}
	
	
}
