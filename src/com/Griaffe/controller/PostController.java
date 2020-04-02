package com.Griaffe.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Comment;
import com.Griaffe.pojo.Follow;
import com.Griaffe.pojo.Post;
import com.Griaffe.service.CommentService;
import com.Griaffe.service.FollowService;
import com.Griaffe.service.PostService;
import com.Griaffe.util.Common;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService postService;
	
	@Autowired
	CommentService commentService;
	
	@Autowired
	FollowService followService;
	
	@RequestMapping("/sendpost")
	public ModelAndView sendPost(Integer user_id) {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("sendpost");
		mv.addObject("user_id", user_id);
		return mv;
		
		
	}
	
	@RequestMapping("/add")
	public ModelAndView addPost(Integer post_user,String post_name, MultipartFile  file,String post_user_name) {
		ModelAndView mv = new ModelAndView();
		System.out.println("user_id:  "+post_user+"   post_name:  "+post_name+"  file:  "+file.getOriginalFilename());
		String post_image = Common.fileUp(file);
		Integer post_praise_num = 0;
		String post_date = Common.getDate();
		Post post = new Post(null, post_name, post_user, post_image, post_praise_num,post_user_name,post_date);
		postService.addPost(post);
		mv.setViewName("index");
		mv.addObject("user_id", post_user);
		return mv;
	}
	
	@RequestMapping("mypost")
	public ModelAndView myPost(Integer post_user) {
		System.out.println("post_user:  "+post_user);
		ModelAndView mv = new ModelAndView();
		Post post = new Post();
		post.setPost_user(post_user);
		ArrayList<Post> posts = postService.selectPost(post);
		for (Post post2 : posts) {
			post2.toString();
		}
		mv.setViewName("mypost");
		mv.addObject("user_id", post_user);
		mv.addObject("posts", posts);
		return mv;
	}
	
	@RequestMapping("/deletePost")
	public ModelAndView deletePost(Integer post_id,Integer post_user) {
		ModelAndView mv = new ModelAndView();
		
		Post post = new Post();
		post.setPost_id(post_id);
		postService.deletePost(post);
		Post post1 = new Post();
		post1.setPost_user(post_user);
		ArrayList<Post> posts = postService.selectPost(post1);
		for (Post post2 : posts) {
			post2.toString();
		}
		mv.setViewName("mypost");
		mv.addObject("user_id", post_user);
		mv.addObject("posts", posts);
		return mv;
	}
	
	@RequestMapping("/postlive")
	public ModelAndView postlive() {
		ModelAndView mv = new ModelAndView();
		ArrayList<Post> livePosts = postService.selectPostByTime();
		mv.setViewName("postlive");
		mv.addObject("livePosts", livePosts);
		return mv;
	}
	
	@RequestMapping("/hotpost")
	public ModelAndView hotpost() {
		ModelAndView mv = new ModelAndView();
		ArrayList<Post> hotPosts = postService.selectPostByPraiseNum();
		mv.setViewName("hotpost");
		mv.addObject("hotPosts", hotPosts);
		return mv;
	}
	
	@RequestMapping("/onepost")
	public ModelAndView onepost(Integer post_id) {
		ModelAndView mv = new ModelAndView();
		Post post = new Post();
		post.setPost_id(post_id);
		ArrayList<Post> onePosts = postService.selectPost(post);
		Post onePost = postService.selectPost(post).get(0);
		ArrayList<Comment> comments = commentService.selectCommentByPost_id(post_id);
		mv.setViewName("onepost");
		mv.addObject("onePost", onePost);
		mv.addObject("onePosts", onePosts);
		mv.addObject("comments", comments);
		return mv;
	}
	
	
	@RequestMapping("/follow")
	public ModelAndView myfollow(Integer user_id) {
		ModelAndView mv = new ModelAndView();
		Follow follow = new Follow();
		follow.setUser_id(user_id);
		ArrayList<Follow> follows = followService.selectFollow(follow);
		ArrayList<Post> myfollow = new ArrayList<Post>();
		for (Follow follow2 : follows) {
			Post post = new Post();
			post.setPost_user(follow2.getFollow_user_id());
			ArrayList<Post> posts = postService.selectPost(post);
			for (Post post2 : posts) {
				myfollow.add(post2);
			}
		}
		java.util.Collections.sort(myfollow);
		mv.setViewName("follow");
		mv.addObject("follow", myfollow);
		
		return mv;
	}
	
	
	
}
