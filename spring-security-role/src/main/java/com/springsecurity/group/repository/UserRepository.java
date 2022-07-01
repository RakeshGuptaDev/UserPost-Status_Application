package com.springsecurity.group.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.group.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String username);
}
