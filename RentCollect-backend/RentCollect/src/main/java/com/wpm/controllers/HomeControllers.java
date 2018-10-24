package com.wpm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wpm.model.Tenant;
import com.wpm.services.TenantService;

@RestController
public class HomeControllers {
	
	@Autowired
	TenantService tServ;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public Tenant welcome() {
		Tenant t = new Tenant();
		
		t.setFirstName("Michael");
		t.setLastName("Liu");
		t.setSsn(111111111);
		
		tServ.save(t);
		return t;
	}
}
