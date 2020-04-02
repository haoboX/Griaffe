package com.Griaffe.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Griaffe.pojo.Comment;
import com.Griaffe.util.Common;

@Component
public interface CommentMapper {

	public void insertComment(Comment comment) ;
	public ArrayList<Comment> queryComment(Comment comment);
	public void deleteComment(Comment comment);
	public void updateComment(Comment comment);
	public ArrayList<Comment> selectCommentByPost_id(Integer post_id);
	
}
