package com.snoopy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.snoopy.po.Users;
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
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String save(){
		return "users/save";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(Users users,@RequestParam("head") MultipartFile file){
		System.out.println(file.getName());
		this.usersService.save(users);
		//redirect:  表示重定向
		return "redirect:/users/index";
	}
	
	
}
