package com.wpm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpm.model.Lease;

public interface LeaseRepository extends JpaRepository<Lease, Integer> {

	
}
