package com.kayson.JavaSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayson.JavaSpringBoot.entities.Order;
import com.kayson.JavaSpringBoot.repositories.OrderRepository;

//registra a classe como componente do spring e 
@Service
public class OrderService {

	//para o spring faça a injeção de dependencia
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
