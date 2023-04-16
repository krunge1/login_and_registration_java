package com.krunge.loginandregistration.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.krunge.loginandregistration.models.User;

public interface UserRepository extends CrudRepository <User, Long>{
	List <User> findAll();
	
	Optional<User> findByEmail(String email);
}