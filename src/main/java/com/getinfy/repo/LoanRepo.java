package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.LoanEntity;

public interface LoanRepo extends JpaRepository<LoanEntity, Integer>{

}
