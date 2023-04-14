package com.krunge.loginandregistration.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.krunge.loginandregistration.models.User;

public interface UserRepository extends CrudRepository <User, Long>{
	List <User> findAll();
}