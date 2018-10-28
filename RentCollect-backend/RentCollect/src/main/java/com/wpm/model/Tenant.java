package com.wpm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="TENANTS")
public class Tenant {

    @Id
    @Column(name="TENANT_ID")
    @SequenceGenerator(name="TENANT_SEQ_GEN", sequenceName="TENANT_SQ", allocationSize=1)
    @GeneratedValue(generator="TENANT_SEQ_GEN", strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable=false)
    private String firstName;
    
    @Column(nullable=false)
    private String lastName;
    
    @Column(nullable=false)
    private int ssn;
    
    //stores url to link to image in S3 bucket;  
    
    private String driverLicense;
    
    @Override
	public String toString() {
		return "Tenant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn
				+ ", driverLicense=" + driverLicense + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public Tenant(int id, String firstName, String lastName, int ssn, String driverLicense) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.driverLicense = driverLicense;
	}

	public Tenant () {}


  

}