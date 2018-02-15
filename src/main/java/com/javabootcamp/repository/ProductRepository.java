package com.javabootcamp.repository;

import com.javabootcamp.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {

}




