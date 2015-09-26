package com.funcoderz.geoLocator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.funcoderz.geoLocator.pojo.User;

@Controller
@RequestMapping("/user")
public class UserREST {
	@RequestMapping(value="{id}",method = RequestMethod.GET)
	public String getUser(@PathVariable String id, Model model)
	{
		User u = new User();
		model.addAttribute("user", u);
		return "user";
	}
	
}
