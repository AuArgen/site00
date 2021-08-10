package com.example.site00.repos;

import com.example.site00.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
