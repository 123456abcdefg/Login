package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.user;
import com.mapper.userMapper;

public class userServiceimp implements userService{
	// ×¢ÈëUser
		@Autowired
		private userMapper usermapper;

		@Override
		public user getUser(String username,String password){
			return usermapper.getUser(username,password);
			
		}
		
		@Override
		public List<user> findUserList(user user){
			return usermapper.findUserList(user);
		}
		
		@Override
		public void addUser(user user){
			usermapper.addUser(user);
			
		}
		
		@Override
		public void deleteUser(Integer id){
			usermapper.deleteUser(id);
		}
		
		@Override
		public user getUserById(Integer id){
			return usermapper.getUserById(id);
		}
		
		@Override
		public void updateUser(user user){
			usermapper.updateUser(user);
		}
		
}

