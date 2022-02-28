package com.educandoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
