package com.springsecurity.group.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.group.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
