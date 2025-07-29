package com.learning.buisnessproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.buisnessproject.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{
    public Product findByPname(String name);
} 
