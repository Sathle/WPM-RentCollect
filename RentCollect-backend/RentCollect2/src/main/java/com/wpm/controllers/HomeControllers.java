package com.wpm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wpm.services.TenantService;

@RestController
@RequestMapping("/RentCollect")
@CrossOrigin
public class HomeControllers {
	
	@Autowired
	TenantService tServ;
	
	@RequestMapping(value="/RentCollect/home", method=RequestMethod.GET)
	public String welcome() {
		return "Backend is working for Spring Application";
	}
	
	@RequestMapping(value="/RentCollect/test", method=RequestMethod.GET)
	public String what() {
		return "Testing something";
	}
}
