package com.educandoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
