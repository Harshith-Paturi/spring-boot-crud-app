package com.springdemo.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springdemo.demo.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

