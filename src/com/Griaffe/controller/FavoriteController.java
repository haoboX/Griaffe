package com.Griaffe.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Favorite;
import com.Griaffe.pojo.Post;
import com.Griaffe.pojo.Praise;
import com.Griaffe.service.FavoriteService;
import com.Griaffe.service.PostService;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {

	@Autowired
	FavoriteService favoriteService;
	@Autowired
	PostService postService;
	
	
	
	@RequestMapping("myfavorite")
	public ModelAndView myfavorite(Integer user_id,String user_name) {
		ModelAndView mv = new ModelAndView();
		Favorite favorite = new Favorite();
		favorite.setFavorite_user(user_id);
		ArrayList<Favorite> favorites = favoriteService.selectFavorite(favorite);
		ArrayList<Post> myFavoritePosts = new ArrayList<Post>();
		for (Favorite favorite2 : favorites) {
			Post post = postService.selectPostByPostId(favorite2.getFavorite_post());
			myFavoritePosts.add(post);
		}
		mv.addObject("myFavoritePosts", myFavoritePosts);
		mv.addObject("user_name", user_name);
		mv.setViewName("myfavorite");
		return mv;
	}
	@RequestMapping("/hotpostaddfavorite")
	public ModelAndView hotpostaddfavorite(Integer favorite_post,Integer favorite_user) {
		ModelAndView mv = new ModelAndView();
		Favorite favorite = new Favorite();
		favorite.setFavorite_post(favorite_post);
		favorite.setFavorite_user(favorite_user);
		favoriteService.addFavorite(favorite);
		ArrayList<Post> hotPosts = postService.selectPostByTime();
		mv.setViewName("hotpost");
		mv.addObject("hotPosts", hotPosts);
		return mv;
		
	}
	@RequestMapping("/postliveaddfavorite")
	public ModelAndView postliveaddfavorite(Integer favorite_post,Integer favorite_user) {
		ModelAndView mv = new ModelAndView();
		Favorite favorite = new Favorite();
		favorite.setFavorite_post(favorite_post);
		favorite.setFavorite_user(favorite_user);
		favoriteService.addFavorite(favorite);
		ArrayList<Post> livePosts = postService.selectPostByTime();
		mv.setViewName("postlive");
		mv.addObject("livePosts", livePosts);
		return mv;
		
	}
	
	@RequestMapping("/deletefavorite")
	public ModelAndView deletefavorite(Integer favorite_post , Integer favorite_user,String user_name) {
		ModelAndView mv = new ModelAndView();
		Favorite favorite = new Favorite();
		favorite.setFavorite_post(favorite_post);
		favorite.setFavorite_user(favorite_user);
		favoriteService.deleteFavorite(favorite);
		Favorite favorite1 = new Favorite();
		favorite1.setFavorite_user(favorite_user);
		ArrayList<Favorite> favorites = favoriteService.selectFavorite(favorite1);
		ArrayList<Post> myFavoritePosts = new ArrayList<Post>();
		for (Favorite favorite2 : favorites) {
			Post post = postService.selectPostByPostId(favorite2.getFavorite_post());
			myFavoritePosts.add(post);
		}
		mv.addObject("myFavoritePosts", myFavoritePosts);
		mv.addObject("user_name", user_name);
		mv.setViewName("myfavorite");
		return mv;
	}
	
}
