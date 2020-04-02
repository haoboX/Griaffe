package com.Griaffe.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.Comment;

class CommentServiceTest {

	private CommentService commentService;
	@BeforeClass
	private void getService() {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		 commentService = (CommentService) applicationContext.getBean("commentService");
	}
	
	@Test
	void testAdd() {
		Comment comment = new Comment(12, 12, 12, "12", "12", "12");
		commentService.addComment(comment);
	}

	@Test
	void testDelete() {
		Comment comment = new Comment(12, 12, 12, "12", "12", "12");
		commentService.deleteComment(comment);
	}
	@Test
	void testUpdata() {
		Comment comment = new Comment(12, 12, 18, "12", "12", "12");
		commentService.updateComment(comment);
	}
	@Test
	void testSelect() {
		Comment comment = new Comment(12, 12, 12, "12", "12", "12");
		commentService.selectComment(comment);
	}
}
