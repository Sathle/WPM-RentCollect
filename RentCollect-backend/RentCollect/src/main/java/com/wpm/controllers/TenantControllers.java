package com.wpm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wpm.model.Tenant;
import com.wpm.services.TenantService;

@RestController
public class TenantControllers {
	
	@Autowired
	TenantService tServ;
	
	@RequestMapping(value="/Rentcollect/tenants", method=RequestMethod.GET)
	public Tenant getAllTenants() {
		return (Tenant) tServ.findAll();
	}
	
}
