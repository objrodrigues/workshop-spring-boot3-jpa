package com.objrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objrodrigues.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}