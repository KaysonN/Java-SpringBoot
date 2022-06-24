package com.kayson.JavaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kayson.JavaSpringBoot.entities.Category;

//entidade, tipoID
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}