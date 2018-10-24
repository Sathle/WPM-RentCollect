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
		tr.save(t);
	}
}
