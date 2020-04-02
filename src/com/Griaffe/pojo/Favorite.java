package com.Griaffe.pojo;

public class Favorite {

	Integer favorite_id;
	Integer favorite_user;
	Integer favorite_post;
	public Integer getFavorite_id() {
		return favorite_id;
	}
	public void setFavorite_id(Integer favorite_id) {
		this.favorite_id = favorite_id;
	}
	public Integer getFavorite_user() {
		return favorite_user;
	}
	public void setFavorite_user(Integer favorite_user) {
		this.favorite_user = favorite_user;
	}
	public Integer getFavorite_post() {
		return favorite_post;
	}
	public void setFavorite_post(Integer favorite_post) {
		this.favorite_post = favorite_post;
	}
	@Override
	public String toString() {
		return "Favorite [favorite_id=" + favorite_id + ", favorite_user=" + favorite_user + ", favorite_post="
				+ favorite_post + "]";
	}
	public Favorite(Integer favorite_id, Integer favorite_user, Integer favorite_post) {
		super();
		this.favorite_id = favorite_id;
		this.favorite_user = favorite_user;
		this.favorite_post = favorite_post;
	}
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
