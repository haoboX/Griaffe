package com.Griaffe.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Post;
import com.Griaffe.pojo.User;
import com.Griaffe.service.PostService;
import com.Griaffe.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	PostService postService;
	
	
	@RequestMapping("/changeinformation")
	public ModelAndView changeinformation(User user) {
		ModelAndView mv = new ModelAndView();
		User user0 = userService.selectUser(user).get(0);
		
		mv.setViewName("changeinformation");
		mv.addObject("user",user0);
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView insertUser(User user) {
		user.setUser_state(0);
		userService.addUser(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		mv.addObject("error","已注册，未登录");
		return mv;
	}
	
	
	
	@RequestMapping("/login")
	public ModelAndView login(String account, String user_password, Integer user_role,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		User u0 = new User();
		User u1 = new User();
		u0.setUser_phone(account);
		u1.setUser_email(account);
		if(account.equals("")){
			mv.addObject("error","登录信息不能为空!!!");
			mv.setViewName("login");
			return mv;
		}
		if(user_password.equals("")){
			mv.addObject("error","密码不能为空!!!");
			mv.setViewName("login");
			return mv;
		}
		if(user_role==null){
			mv.addObject("error","请选择用户类型!!!");
			mv.setViewName("login");
			return mv;
		}
		
		ArrayList<User> users0 = userService.selectUser(u0);
		ArrayList<User> users1 = userService.selectUser(u1);
		
		if (!users0.isEmpty()) {
			User user0 = users0.get(0);
			if (user0.getUser_state()==-1) {
				mv.addObject("error","账号已被封禁，无法登录!!!");
				mv.setViewName("login");
				return mv;
			}
			System.out.println("user0："+user0.getUser_password());
			if (user0.getUser_password().equals(user_password)) {
				if (user_role == 0 && user0.getUser_role() == 0) {
					session.setAttribute("user", user0);
					mv.setViewName("index");
					System.out.println("登陆成功");
					return mv;
				}
				if (user_role == 1 && user0.getUser_role() == 1) {
					User user = new User();
					user.setUser_role(0);
					ArrayList<User> users = userService.selectUser(user);
					session.setAttribute("user", user0);
					mv.setViewName("admin_showusers");
					mv.addObject("users", users);
					return mv;
				}
			}

		}
		if (!users1.isEmpty()) {
			User user1 = users1.get(0);
			if (user1.getUser_state()==-1) {
				mv.addObject("error","账号已被封禁，无法登录!!!");
				mv.setViewName("login");
				return mv;
			}
			System.out.println("user1："+user1.getUser_password());
			System.out.println(user1.getUser_password());
			if (user1.getUser_password().equals(user_password)) {
				if (user_role == 0 && user1.getUser_role() == 0) {
					session.setAttribute("user", user1);
					mv.setViewName("index");
					System.out.println("登陆成功");

					return mv;
				}
				if (user_role == 1 && user1.getUser_role() == 1) {
					User user = new User();
					user.setUser_role(0);
					ArrayList<User> users = userService.selectUser(user);
					session.setAttribute("user", user1);
					mv.setViewName("admin_showusers");
					mv.addObject("users", users);
					return mv;
				}
			}
		}
		mv.addObject("error", "信息错误，请重新填写");
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/outlogin")
	public String OutLogin(HttpSession session){
		session.invalidate();
		return "login";
	}
	
	@RequestMapping("/update")
	public String updateUser(User user) {
		userService.updateUser(user);
		return "index";
	}
	
	@RequestMapping("/findpassword")
	public ModelAndView findpassword(String user_phone,String user_email,String user_question,String user_answer) {
		ModelAndView mv = new ModelAndView();
		User user1 = new User();
		User user2 = new User();
		user1.setUser_phone(user_phone);
		user2.setUser_email(user_email);
		ArrayList<User> users1 = userService.selectUser(user1);
		ArrayList<User> users2 = userService.selectUser(user2);
		if (users1!=null) {
			User user = users1.get(0);
			if (user.getUser_question().equals(user_question)&&user.getUser_answer().equals(user_answer)) {
				mv.setViewName("changePassword");
				mv.addObject("user_id", user.getUser_id());
				return mv;
			}else {
				mv.setViewName("findPassword");
				mv.addObject("error", "信息错误，请重新填写");
				return mv;
			}
		}
		
		if (users2!=null) {
			User user = users2.get(0);
			if (user.getUser_question().equals(user_question)&&user.getUser_answer().equals(user_answer)) {
				mv.setViewName("changePassword");
				mv.addObject("user_id", user.getUser_id());
				return mv;
			}else {
				mv.setViewName("findPassword");
				mv.addObject("error", "信息错误，请重新填写");
				return mv;
			}
		}
		
		mv.setViewName("findPassword");
		mv.addObject("error", "用户不存在，请重新填写");
		return mv;
	}
	
	@RequestMapping("/myinformation")
	public ModelAndView myinformation(Integer user_id,String user_name) {
		ModelAndView mv = new ModelAndView();
		Post post = new Post();
		post.setPost_user(user_id);
		ArrayList<Post> posts = postService.selectPost(post);
		Integer myinformation_numOfPosts = posts.size();

		mv.addObject("myinformation_Posts", posts);
		mv.addObject("myinformation_numOfPosts", myinformation_numOfPosts);
		mv.addObject("myinformation_user_name", user_name);
		mv.setViewName("myinformation");
		return mv;
	}
	
	@RequestMapping("/otherinformation")
	public ModelAndView otherinformation(Integer user_id,String user_name) {
		ModelAndView mv = new ModelAndView();
		Post post = new Post();
		post.setPost_user(user_id);
		ArrayList<Post> posts = postService.selectPost(post);
		Integer otherinformation_numOfPosts = posts.size();

		mv.addObject("other_user_id", user_id);
		mv.addObject("otherinformation_Posts", posts);
		mv.addObject("otherinformation_numOfPosts", otherinformation_numOfPosts);
		mv.addObject("otherinformation_user_name", user_name);
		mv.setViewName("otherinformation");
		return mv;
	}
}
