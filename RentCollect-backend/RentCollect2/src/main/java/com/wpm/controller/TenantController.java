package com.wpm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wpm.model.Tenant;
import com.wpm.services.TenantService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/RentCollect")
@CrossOrigin
public class TenantController {
	
	
	@Autowired
	TenantService tServ;
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TenantController.class);
	
	@RequestMapping(value="/saveTenant", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveTenant(@Valid @RequestBody Tenant t) {
		System.out.println("----------------------------------------------------------");
		System.out.println(t);
		tServ.save(t);
	}
	
	@RequestMapping(value="/getTenants", method=RequestMethod.GET)
	public List<Tenant> getTenants() {
		
		log.info("Getting Tenant...");
		return (List<Tenant>) tServ.findAll();
		
	}
	
}
