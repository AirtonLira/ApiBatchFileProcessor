package com.airton.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airton.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}