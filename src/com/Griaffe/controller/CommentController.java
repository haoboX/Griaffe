package com.Griaffe.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Comment;
import com.Griaffe.pojo.Post;
import com.Griaffe.service.CommentService;
import com.Griaffe.service.PostService;
import com.Griaffe.util.Common;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	CommentService commentService;
	@Autowired
	PostService postService;
	
	
	@RequestMapping("/add")
	public ModelAndView addComment(Integer comment_post,Integer comment_user,String comment_user_name,String comment_content) {
		System.out.println("comment_post:  "+comment_post+"comment_user:  "+comment_user+"comment_user_name:  "+comment_user_name+"comment_content:  "+comment_content);
		ModelAndView mv = new ModelAndView();
		Post post = new Post();
		post.setPost_id(comment_post);
		String comment_date = Common.getDate();
		Comment comment = new Comment(null, comment_post, comment_user, comment_content, comment_user_name, comment_date);
		commentService.addComment(comment);
		
		ArrayList<Post> onePosts = postService.selectPost(post);

		mv.setViewName("onepost");
		Post onePost = postService.selectPost(post).get(0);
		ArrayList<Comment> comments = commentService.selectCommentByPost_id(comment_post);
		mv.addObject("onePost", onePost);
		mv.addObject("onePosts", onePosts);
		mv.addObject("comments", comments);
		return mv;
	}
	
	
}
