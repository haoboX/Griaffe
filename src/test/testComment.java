package test;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.Comment;
import com.Griaffe.service.CommentService;

public class testComment {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		CommentService commentService = (CommentService) applicationContext.getBean("commentService");
		Comment comment = new Comment();
		ArrayList<Comment> comments = commentService.selectComment(comment);
		for (Comment comment2 : comments) {
			System.out.println(comment2.toString());
		}
	}
}
