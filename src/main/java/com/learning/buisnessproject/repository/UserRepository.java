package com.learning.buisnessproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.buisnessproject.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
    public User findByUemail(String email);
    
}
