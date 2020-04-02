package com.Griaffe.dao;

import java.util.ArrayList;

import com.Griaffe.pojo.Favorite;



public interface FavoriteMapper {

	public void insertFavorite(Favorite favorite) ;
	public ArrayList<Favorite> queryFavorite(Favorite favorite);
	public void deleteFavorite(Favorite favorite);
	public void updateFavorite(Favorite favorite);
	public ArrayList<Favorite> selectFavoriteByPost_id(Integer favorite);
	
}
