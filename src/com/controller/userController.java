package com.controller;

import java.util.List;

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
@RequestMapping("/admin")

public class userController {
	// ×¢ÈëUserService
	
	@Autowired
	private userService userService;

	
	@RequestMapping("/index")
	public String index(){

		return "index";
	}
	
	
	// µÇÂ¼
	@RequestMapping("/login")
	public String login(HttpServletRequest request,
			String username,String password){
		
		user user =userService.getUser(username,password);
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject(user);
		
		if(user.getIdent().equals("1"))
			
			return "redirect:/admin/user/userlist.action";
		
		else
			return "redirect:/admin/index.action";

	}
	
	
	@RequestMapping("/error")
	public String error(){

		return "error";
	}
	
	
	
	
	

}
