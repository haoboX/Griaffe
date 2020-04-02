package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.FavoriteMapper;
import com.Griaffe.pojo.Favorite;

@Service
public class FavoriteService {

	public FavoriteService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired FavoriteMapper mapper;
	
	public void addFavorite(Favorite favorite) {
		mapper.insertFavorite(favorite);
	}
	
	public void deleteFavorite(Favorite favorite) {
		mapper.deleteFavorite(favorite);
	}
	
	public ArrayList<Favorite> selectFavorite(Favorite favorite){
		return mapper.queryFavorite(favorite);
	}
	
	public void updateFavorite(Favorite favorite) {
		mapper.updateFavorite(favorite);
	}

	
	
}
