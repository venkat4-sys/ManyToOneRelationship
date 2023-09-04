package com.getinfy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer_tbl")
public class CustomerEntity {
	
	@Id
	private Integer customerId;
	
	private String customerName;

}
