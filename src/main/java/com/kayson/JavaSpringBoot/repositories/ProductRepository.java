package com.kayson.JavaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kayson.JavaSpringBoot.entities.Product;

//entidade, tipoID
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}