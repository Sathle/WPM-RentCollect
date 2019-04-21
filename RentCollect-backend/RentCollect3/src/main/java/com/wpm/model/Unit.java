package com.wpm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.wpm.enums.UnitStatus;

@Component
@Entity
@Table(name = "UNITS")
public class Unit {

	@Id
	@Column(name = "UNIT_ID")
	@SequenceGenerator(name = "UNIT_SEQ_GEN", sequenceName = "UNIT_SQ", allocationSize = 1)
	@GeneratedValue(generator = "UNIT_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(nullable=false)
	private String address;
	
	@Column
	private Double bathroom;
	
	@Column
	private int bedroom;
	
	private UnitStatus status; 
	
	@Enumerated(EnumType.ORDINAL)
	private UnitStatus getStatus () {
		return status;
	}
}
