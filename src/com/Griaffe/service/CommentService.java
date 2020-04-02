package com.Griaffe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Griaffe.dao.CommentMapper;
import com.Griaffe.pojo.Comment;
import com.Griaffe.util.Common;

@Service
public class CommentService {

	public CommentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private CommentMapper mapper;
	
	public void addComment(Comment comment) {
		mapper.insertComment(comment);
	}
	
	public void deleteComment(Comment comment) {
		mapper.deleteComment(comment);
	}
	
	public ArrayList<Comment> selectComment(Comment comment){
		return mapper.queryComment(comment);
	}
	
	public void updateComment(Comment comment) {
		mapper.updateComment(comment);
	}

	public ArrayList<Comment> selectCommentByPost_id(Integer post_id) {
		// TODO Auto-generated method stub
		return mapper.selectCommentByPost_id(post_id);
	}
	
	
}
