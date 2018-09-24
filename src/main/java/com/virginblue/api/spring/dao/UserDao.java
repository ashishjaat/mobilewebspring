package com.virginblue.api.spring.dao;
 
import java.util.List;
 
import com.virginblue.api.spring.model.User;
 
public interface UserDao {
     
    List<User> findAllUsers();  
    User findByUserName(String userName);
    
}