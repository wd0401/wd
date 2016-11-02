package com.snoopy.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snoopy.service.UsersService;
@Controller
@Scope(value="prototype")
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	@Autowired(required=true)
	private HttpServletRequest request;
	
	@RequestMapping(value={"","/","/index"})
	public String index(){
		request.setAttribute("users", this.usersService.findAll());
		return "users/index";
	}
}
