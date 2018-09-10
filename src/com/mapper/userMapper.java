package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.entity.user;

public interface userMapper {
	
	
     public user getUser(String username,String password);

	
	 public List<user> findUserList(user user);
	 
	 
	 public void addUser(user user);
	 
	 public void deleteUser(Integer id);
		
	 public user getUserById(Integer id);
		
	 public void updateUser(user user);
	 
	 
}
