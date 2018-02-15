package com.javabootcamp.repository;

import com.javabootcamp.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
