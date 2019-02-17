package com.wpm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wpm.model.Lease;

@Repository
public interface LeaseRepository extends JpaRepository<Lease, Integer> {

	
}
