package com.javabootcamp.repository;

import com.javabootcamp.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
