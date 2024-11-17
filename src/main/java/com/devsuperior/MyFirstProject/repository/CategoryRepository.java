package com.devsuperior.MyFirstProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.MyFirstProject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{


}