package com.learning.buisnessproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.buisnessproject.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer>  {
    public Admin findByAdminEmail(String email);
}
