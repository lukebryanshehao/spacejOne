package com.spacej.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping("/getusers")
    @ResponseBody
    public List<User> getUserList() {
    	List<User> userList = null;
    	try {
    		userList = userService.findUsersResultMap();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return userList;
    }
    
    @GetMapping("/insertuser")
	public ModelAndView insertUser(HttpServletRequest request,
            HttpServletResponse response) throws ParseException {
    	
    	try {
    		User user = new User();
        	user.setUsername(request.getParameter("username"));
        	user.setSex(request.getParameter("sex"));
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	String birthday = request.getParameter("birthday");
        	if(!StringUtils.isEmpty(birthday)) {
        		Date birthdayParse = sdf.parse(birthday);
            	user.setBirthday(birthdayParse);
        	}
        	user.setAddress(request.getParameter("address"));
        	
			userService.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return new ModelAndView("redirect:/user/getusers");
    }
}
