package com.objrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objrodrigues.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}