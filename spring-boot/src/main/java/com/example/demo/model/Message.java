package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Rental rental;

  @ManyToOne
  private User user;

  private String message;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  // Getters and Setters
}
