package com.example.kinozippy.repository;

import com.example.kinozippy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<Customer,Integer> {
}
