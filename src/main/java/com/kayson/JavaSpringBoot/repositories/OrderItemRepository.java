package com.kayson.JavaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kayson.JavaSpringBoot.entities.OrderItem;

//entidade, tipoID
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}