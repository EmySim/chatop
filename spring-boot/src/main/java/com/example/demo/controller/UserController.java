package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String email;
  private String name;
  private String password;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  // Getters and Setters
}
