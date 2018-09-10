package com.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.user;
import com.service.userService;

@Controller
@RequestMapping("/admin/user")

public class userlistController {
	// 注入UserService
	
	@Autowired
	private userService userService;

	
	@RequestMapping("/userlist")
	public ModelAndView userlist(HttpServletRequest request,Integer search){
		
		user user = new user();
		user.setId(search);
		
		List<user> userlist = userService.findUserList(user);
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("userlist",userlist);
		
		modelandview.setViewName("login");
	
		return modelandview;
	
	}
		
	//新增页面
	@RequestMapping("/add")
	public String add(HttpServletRequest request){
		
		return "add_do";
		
	}
	
	//增加用户
	@RequestMapping("/add_do")
	public String add_do(HttpServletRequest request,
			String username,String password,String ident){
		
		user user = new user();
		
		user.setUsername(username);
		user.setPassword(password);
		user.setIdent(ident);
		
		userService.addUser(user);
		
		return  "forward:userlist.action";
	
	}
	
	
		
		//删除用户
		@RequestMapping("/delete_do")
		public String delete_do(HttpServletRequest request,
				Integer id){
			
			
			userService.deleteUser(id);
			
			return  "forward:userlist.action";
		
		}
		
		
		
		//修改页面
		@RequestMapping("/update")
		public ModelAndView update(Integer id){
			ModelAndView modelandview = new ModelAndView();
			
			user user=userService.getUserById(id);
			modelandview.addObject(user);
			
			modelandview.setViewName("add_do");
			
			return modelandview;
			
			
		}
		
		//修改用户信息
		@RequestMapping("/update_do")
		public String update_do(HttpServletRequest request,Integer id,
				String username,String password,String ident){
			
			user user = new user();
			
			user.setId(id);
			user.setUsername(username);
			user.setPassword(password);
			user.setIdent(ident);
			
			userService.updateUser(user);
			
			return  "forward:userlist.action";
		
		}
		
		
		
		
	
	
	
	
	}
	
	
	
	
	
	
