package com.Griaffe.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Comment;
import com.Griaffe.pojo.Post;
import com.Griaffe.pojo.Praise;
import com.Griaffe.service.CommentService;
import com.Griaffe.service.PostService;
import com.Griaffe.service.PraiseService;

@Controller
@RequestMapping("/praise")
public class PraiseController {

	@Autowired
	PraiseService praiseService;
	@Autowired
	PostService postService;
	@Autowired
	CommentService commentService;
	
	
	@RequestMapping("/postlivepraisePost")
	
	public ModelAndView postlivepraisePost(Integer praise_post,Integer praise_user) {
		System.out.println("praise_post:   "+praise_post+"  praise_user:"+praise_user);
		ModelAndView mv = new ModelAndView();
		Praise praise = new Praise();
		praise.setPraise_post(praise_post);
		praise.setPraise_user(praise_user);
		praiseService.addPraise(praise);
		postService.updatePostPraise(praise_post);
		ArrayList<Post> livePosts = postService.selectPostByTime();
		mv.setViewName("postlive");
		mv.addObject("livePosts", livePosts);
		
		return mv;
	}
	
	@RequestMapping("/hotpostpraisePost")
	public ModelAndView hotpostpraisePost(Integer praise_post,Integer praise_user) {
		System.out.println("praise_post:   "+praise_post+"  praise_user:"+praise_user);
		ModelAndView mv = new ModelAndView();
		Praise praise = new Praise();
		praise.setPraise_post(praise_post);
		praise.setPraise_user(praise_user);
		praiseService.addPraise(praise);
		postService.updatePostPraise(praise_post);
		ArrayList<Post> hotPosts = postService.selectPostByTime();
		mv.setViewName("hotpost");
		mv.addObject("hotPosts", hotPosts);
		
		return mv;
	}
	
	@RequestMapping("/praiseOnePost")
	public ModelAndView praiseOnePost(Integer praise_post,Integer praise_user) {
		System.out.println("praise_post:   "+praise_post+"  praise_user:"+praise_user);
		ModelAndView mv = new ModelAndView();
		Praise praise = new Praise();
		praise.setPraise_post(praise_post);
		praise.setPraise_user(praise_user);
		praiseService.addPraise(praise);
		postService.updatePostPraise(praise_post);
		Post post = new Post();
		
		post.setPost_id(praise_post);
		
		ArrayList<Post> onePosts = postService.selectPost(post);

		mv.setViewName("onepost");
		Post onePost = postService.selectPost(post).get(0);
		ArrayList<Comment> comments = commentService.selectCommentByPost_id(praise_post);
		mv.addObject("onePost", onePost);
		mv.addObject("onePosts", onePosts);
		mv.addObject("comments", comments);
		
		return mv;
	}
	
	
}
