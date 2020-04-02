package com.Griaffe.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Griaffe.pojo.Post;

@Component
public interface PostMapper {

	public void insertPost(Post post) ;
	public ArrayList<Post> queryPost(Post post);
	public ArrayList<Post> queryPostByTime();
	public Post queryPostByPostId(Integer post_id);
	public void deletePost(Post post);
	public void updatePost(Post Post);
	public void updatePostPraise(Integer praise_post);
	public ArrayList<Post> queryPostByPraiseNum();
}
