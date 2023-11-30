package com.objrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objrodrigues.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}