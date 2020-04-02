package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.PostMapper;
import com.Griaffe.pojo.Post;

@Service
public class PostService {

	public PostService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private PostMapper mapper;
	
	public void addPost(Post post) {
		mapper.insertPost(post);
	}
	
	public void deletePost(Post post) {
		mapper.deletePost(post);
	}
	
	public ArrayList<Post> selectPost(Post post){
		return mapper.queryPost(post);
	}
	
	public void updatePost(Post post) {
		mapper.updatePost(post);
	}
	
	public ArrayList<Post> selectPostByTime(){
		return mapper.queryPostByTime();
	}

	public ArrayList<Post> selectPostByPraiseNum(){
		return mapper.queryPostByPraiseNum();
	}
	
	public Post selectPostByPostId(Integer post_id){
		return mapper.queryPostByPostId(post_id);
	}
	public void updatePostPraise(Integer praise_post) {
		// TODO Auto-generated method stub
		 mapper.updatePostPraise(praise_post);
	}
}
