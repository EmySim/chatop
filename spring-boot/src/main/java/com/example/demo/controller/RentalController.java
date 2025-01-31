package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Rental {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private BigDecimal surface;
  private BigDecimal price;
  private String picture;
  private String description;

  @ManyToOne
  private User owner;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  // Getters and Setters
}
