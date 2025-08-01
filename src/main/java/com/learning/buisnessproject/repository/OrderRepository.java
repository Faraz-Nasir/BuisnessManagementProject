package com.learning.buisnessproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.buisnessproject.entities.Orders;
import com.learning.buisnessproject.entities.User;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
    List<Orders> findOrdersByUser(User user);
}
