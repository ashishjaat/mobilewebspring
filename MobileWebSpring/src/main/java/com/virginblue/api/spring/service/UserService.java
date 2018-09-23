package com.virginblue.api.spring.service;
 
import java.util.List;
 
import com.virginblue.api.spring.model.User;
 
public interface UserService {
	
    List<User> findAllUsers(); 
    User findByUserName(String userName);
    
}