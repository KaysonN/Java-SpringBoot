package com.kayson.JavaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kayson.JavaSpringBoot.entities.Order;

//entidade, tipoID
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}