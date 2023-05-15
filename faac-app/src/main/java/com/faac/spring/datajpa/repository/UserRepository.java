package com.faac.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faac.spring.datajpa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByUsername(String username);
}
