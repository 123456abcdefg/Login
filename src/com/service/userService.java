package com.service;

import java.util.List;
import com.entity.user;

public interface userService {

	public user getUser(String username,String password);

	public List<user> findUserList(user user);
	
	
	public void addUser(user user);
	
	public void deleteUser(Integer id);
	
	public user getUserById(Integer id);
	
	public void updateUser(user user);
	
	
}
