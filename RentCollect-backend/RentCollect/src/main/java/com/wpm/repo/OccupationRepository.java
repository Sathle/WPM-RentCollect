package com.wpm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wpm.model.Occupation;

@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Integer> {

}
