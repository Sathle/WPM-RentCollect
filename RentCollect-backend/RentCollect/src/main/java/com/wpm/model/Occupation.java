package com.wpm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Occupation {
	
	@Id
    @Column(name="OCCUPATION_ID")
    @SequenceGenerator(name="OCCUPATION_SEQ_GEN", sequenceName="OCCUPATION_SQ", allocationSize=1)
    @GeneratedValue(generator="OCCUPATION_SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="TENANT_ID", referencedColumnName="TENANT_ID", foreignKey=@ForeignKey(name ="FK_TENANT_ID_OCCUPATION"))
	private Tenant tenant;
	
	@Column(nullable=false)
    private String occupation;
    
    @Column(nullable=false)
    private Double monthlyIncome;
	

}
