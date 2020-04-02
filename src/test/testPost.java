package test;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.Post;
import com.Griaffe.service.PostService;

import javafx.geometry.Pos;

public class testPost {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		PostService postService = (PostService) applicationContext.getBean("postService");
		ArrayList<Post> posts = postService.selectPostByTime();
		for (Post post : posts) {
			System.out.println(post.toString());
		}
		
		
	}
}
