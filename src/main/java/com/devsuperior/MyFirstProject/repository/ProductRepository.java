package com.devsuperior.MyFirstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.devsuperior.MyFirstProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	

}