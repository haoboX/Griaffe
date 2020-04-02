package com.Griaffe.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Follow;
import com.Griaffe.pojo.Post;
import com.Griaffe.service.FollowService;
import com.Griaffe.service.PostService;

@Controller
@RequestMapping("/follow")
public class FollowController {

	@Autowired
	FollowService followService;
	@Autowired
	PostService postService;
	
	
	@RequestMapping("/myfollow")
	public ModelAndView myfollow(Integer user_id,String user_name){
		ModelAndView mv = new ModelAndView();
		Follow follow = new Follow();
		follow.setUser_id(user_id);
		ArrayList<Follow> follows = followService.selectFollow(follow);
		mv.addObject("follows",follows);
		mv.addObject("user_name", user_name);
		mv.setViewName("myfollow");
		return mv;
	} 
	
	@RequestMapping("/deletefollow")
	public ModelAndView deletefollow(Integer follow_id,Integer user_id,String user_name) {
		ModelAndView mv = new ModelAndView();
		Follow follow = new Follow();
		follow.setFollow_user_id(user_id);
		ArrayList<Follow> follows = followService.selectFollow(follow);
		mv.addObject("follows",follows);
		mv.addObject("user_name", user_name);
		mv.setViewName("myfollow");
		return mv;
	}
	@RequestMapping("/addfollow")
	public ModelAndView addfollow(Integer user_id,Integer follow_user,String user_name,String follow_user_name) {
		ModelAndView mv = new ModelAndView();
		Follow follow = new Follow();
		follow.setUser_id(user_id);
		follow.setUser_name(user_name);
		follow.setFollow_user_id(follow_user);
		follow.setFollow_user_name(follow_user_name);
		
		ArrayList<Follow> follows = followService.selectFollow(follow);
		
		if (follows.isEmpty()) {
			followService.addFollow(follow);
			Post post = new Post();
			post.setPost_user(follow_user);
			ArrayList<Post> posts = postService.selectPost(post);
			Integer otherinformation_numOfPosts = posts.size();

			mv.addObject("other_user_id", follow_user);
			mv.addObject("otherinformation_Posts", posts);
			mv.addObject("otherinformation_numOfPosts", otherinformation_numOfPosts);
			mv.addObject("otherinformation_user_name", follow_user_name);
			mv.setViewName("otherinformation");
			return mv;
		}
		Post post = new Post();
		post.setPost_user(follow_user);
		ArrayList<Post> posts = postService.selectPost(post);
		Integer otherinformation_numOfPosts = posts.size();

		mv.addObject("error", "已关注，不能重复关注");
		mv.addObject("other_user_id", follow_user);
		mv.addObject("otherinformation_Posts", posts);
		mv.addObject("otherinformation_numOfPosts", otherinformation_numOfPosts);
		mv.addObject("otherinformation_user_name", follow_user_name);
		mv.setViewName("otherinformation");
		return mv;
		
	}
	
	
}
