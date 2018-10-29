package com.wpm.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wpm.model.Tenant;

@Repository
public interface TenantRepository extends CrudRepository<Tenant, Integer> {

	
}

