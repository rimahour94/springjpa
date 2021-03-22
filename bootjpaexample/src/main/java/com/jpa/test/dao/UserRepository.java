package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User,Integer> {

    List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
	
}