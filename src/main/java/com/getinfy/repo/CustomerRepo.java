package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer>{

}
