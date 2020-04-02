package test;


import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.User;
import com.Griaffe.service.UserService;

public class testUser {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService= (UserService) applicationContext.getBean("userService");
		User user = new User();
		for (int i = 51; i < 100; i++) {
			user.setUser_email(System.currentTimeMillis()+"qq.com");
			user.setUser_id(i);
			userService.updateUser(user);
			user.setUser_id(null);
			user.setUser_email(null);
		}
		
		
		ArrayList<User> users = userService.selectUser(user);
		for (User user2 : users) {
			System.out.println(user2.toString());
		}
		
		
		
		
	}
}
