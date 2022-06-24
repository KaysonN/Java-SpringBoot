package com.kayson.JavaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kayson.JavaSpringBoot.entities.User;

//entidade, tipoID
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}