package com.wpm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpm.controller.TenantController;
import com.wpm.model.Tenant;
import com.wpm.repo.TenantRepository;

@Service
public class TenantService {

	@Autowired
	TenantRepository tr;
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TenantService.class);
	
	public void save(Tenant t) {
		System.out.println("-----4574874-----------------------------------------------------");
		System.out.println(t);
		tr.save(t);
	}
	
	public Iterable<Tenant> findAll() {
		log.info("Inside findAll Service Method...");
		return tr.findAll();
	}
}
