package com.wpm.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="LEASES")
public class Lease {

	@Id
	@Column(name = "LEASE_ID")
	@SequenceGenerator(name = "LEASE_SEQ_GEN", sequenceName = "LEASE_SQ", allocationSize = 1)
	@GeneratedValue(generator = "LEASE_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="TENANT_ID", referencedColumnName="TENANT_ID", foreignKey=@ForeignKey(name ="FK_TENANT_ID_LEASE"))
	private Tenant tenant;

	private String lease;

	@Column(nullable = false)
	private Timestamp startDate;

	@Column(nullable = false)
	private Timestamp endDate;
	
	/* 0. Processing
	 * 1. Active
	 * 2. Terminated
	 */
	
	private Status status;
	
	@Enumerated(EnumType.ORDINAL)
	private Status getStatus () {
		return status;
	}

}
