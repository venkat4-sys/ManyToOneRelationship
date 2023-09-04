package com.getinfy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="loan_tbl")
@Entity
public class LoanEntity {
	
	@Id
	private Integer loanId;
	
	private String loanType;
	
	private Integer loanAmount;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId")
	private CustomerEntity customer;

}
