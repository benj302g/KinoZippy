package com.example.kinozippy.repository;

import com.example.kinozippy.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserLogin,Integer> {
}
