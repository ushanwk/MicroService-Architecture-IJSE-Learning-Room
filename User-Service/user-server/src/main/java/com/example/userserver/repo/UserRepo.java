package com.example.userserver.repo;

import com.example.userserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, String> {
}
