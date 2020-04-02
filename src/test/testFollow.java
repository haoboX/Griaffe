package test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.Follow;
import com.Griaffe.service.FollowService;

public class testFollow {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		FollowService followService = (FollowService) applicationContext.getBean("followService");
		Follow follow = new Follow();
		follow.setFollow_user_id(123456);
		follow.setFollow_user_name("Ðíð©²©");
		follow.setUser_id(987654);
		follow.setUser_name("Ðíð©²©");

		for (int i = 0; i < 100; i++) {
			followService.addFollow(follow);
			follow.setFollow_id(i+1);
			follow.setFollow_user_id(123456);
			follow.setFollow_user_name("hello");
			follow.setUser_id(987654);
			follow.setUser_name("world");
			followService.updateFollow(follow);
		}
		for (int i = 0; i < 100; i++) {
			follow.setFollow_id(i+1);
			follow.setFollow_user_id(123456);
			follow.setFollow_user_name("hello");
			follow.setUser_id(987654);
			follow.setUser_name("world");
			followService.updateFollow(follow);
		}
		Follow follow2 = new Follow();
		ArrayList<Follow> follows = followService.selectFollow(follow2);
		for (Follow follow3 : follows) {
			System.out.println(follow3.toString());
		}
	}
}
