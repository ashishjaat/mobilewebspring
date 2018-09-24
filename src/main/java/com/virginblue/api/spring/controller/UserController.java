package com.virginblue.api.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virginblue.api.spring.model.User;
import com.virginblue.api.spring.service.UserService;

@RestController
@ResponseBody
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	  public void showRegister(HttpServletRequest request, HttpServletResponse response) {
		List<User> users = service.findAllUsers();
	    for (User us : users) {
	        System.out.println(us);
	    }
	    
	    User user = service.findByUserName("kumara15");
	    System.out.println(user);
	  }
	
	
	
}
