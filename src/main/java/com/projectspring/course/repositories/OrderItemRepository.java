package com.projectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
	
	

}
