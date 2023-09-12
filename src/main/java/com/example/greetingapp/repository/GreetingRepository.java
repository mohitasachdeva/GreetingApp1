package com.example.greetingapp.repository;

import com.example.greetingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GreetingRepository extends JpaRepository<User, Integer> {
    Optional<User> findByFirstName(String name);
}
