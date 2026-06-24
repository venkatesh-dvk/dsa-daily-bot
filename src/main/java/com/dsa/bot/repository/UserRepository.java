package com.dsa.bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsa.bot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}