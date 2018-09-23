package com.virginblue.api.spring.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.virginblue.api.spring.dao.UserDao;
import com.virginblue.api.spring.model.User;
 
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao dao;     
    
    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }
    
    public User findByUserName(String userName) {
        return dao.findByUserName(userName);
    }
    
}