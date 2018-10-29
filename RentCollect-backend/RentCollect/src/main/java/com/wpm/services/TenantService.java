package com.wpm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpm.model.Tenant;
import com.wpm.repo.TenantRepository;

@Service
public class TenantService {

	@Autowired
	TenantRepository tr;
	
	public void save(Tenant t) {
		System.out.println("-----4574874-----------------------------------------------------");
		System.out.println(t);
		tr.save(t);
	}
	
	public Iterable<Tenant> findAll() {
		System.out.println("in Service findAll");
		return tr.findAll();
	}
}
