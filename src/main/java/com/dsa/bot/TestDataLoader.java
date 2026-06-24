package com.dsa.bot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dsa.bot.entity.User;
import com.dsa.bot.repository.UserRepository;

@Component
public class TestDataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Application Started");

    }
}