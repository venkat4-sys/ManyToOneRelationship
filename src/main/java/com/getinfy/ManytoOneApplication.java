package com.getinfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.getinfy.entity.CustomerEntity;
import com.getinfy.entity.LoanEntity;
import com.getinfy.repo.LoanRepo;

@SpringBootApplication
public class ManytoOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ManytoOneApplication.class, args);
		LoanRepo loanrepo = context.getBean(LoanRepo.class);
		
		LoanEntity entity=new LoanEntity();
		entity.setLoanId(1);
		entity.setLoanType("fixed");
		entity.setLoanAmount(30000);
		
		CustomerEntity centity=new CustomerEntity();
		centity.setCustomerId(1);
		centity.setCustomerName("surya");
		entity.setCustomer(centity);
		
		loanrepo.save(entity);
		
		
	}

}
