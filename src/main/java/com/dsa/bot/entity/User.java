package com.dsa.bot.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long chatId;

    private String phone;

    private String difficultyPref;

    private Integer streak = 0;

    private Boolean active = true;

    @CreationTimestamp
    private LocalDateTime createdAt;
}