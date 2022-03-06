package com.educandoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
