package com.Griaffe.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Griaffe.pojo.Darkroom;
import com.Griaffe.pojo.User;
import com.Griaffe.service.DarkroomService;
import com.Griaffe.service.UserService;
import com.Griaffe.util.Common;

@Service
@RequestMapping("/darkroom")
public class DarkroomController {

	@Autowired
	DarkroomService darkroomService;
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/addDarkroom")
	public ModelAndView addDarkroom(Integer dark_user) {
		ModelAndView mv = new ModelAndView();
		User user = new User();
		user.setUser_id(dark_user);
		user.setUser_state(-1);
		userService.updateUser(user);
		Darkroom darkroom = new Darkroom();
		darkroom.setDark_user(dark_user);
		darkroom.setDark_date(Common.getDate());
		darkroomService.addDarkroom(darkroom);
		
		User user1 = new User();
		user1.setUser_role(0);
		user1.setUser_state(0);
		ArrayList<User> users = userService.selectUser(user1);
		
		mv.setViewName("admin_showusers");
		mv.addObject("users", users);
		return mv;
	}
	
	
	
}
