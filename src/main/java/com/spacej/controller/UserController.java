package com.spacej.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spacej.entity.User;
import com.spacej.service.UserService;

@Controller
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping("/get/{id}")
    @ResponseBody
    public User getUser(@PathVariable(value = "id") int id) {
    	User user = null;
		try {
			user = userService.findUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return user;
    }
}
