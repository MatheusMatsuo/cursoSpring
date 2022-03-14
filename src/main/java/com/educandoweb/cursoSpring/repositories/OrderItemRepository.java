package com.educandoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursoSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
