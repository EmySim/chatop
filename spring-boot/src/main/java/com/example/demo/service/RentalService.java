package com.example.demo.service;

import com.example.demo.model.Rental;
import com.example.demo.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentalService {

  private final RentalRepository rentalRepository;

  @Autowired
  public RentalService(RentalRepository rentalRepository) {
    this.rentalRepository = rentalRepository;
  }

  public Rental saveRental(Rental rental) {
    return rentalRepository.save(rental);
  }

  public List<Rental> getAllRentals() {
    return rentalRepository.findAll();
  }

  public Optional<Rental> getRentalById(Long id) {
    return rentalRepository.findById(id);
  }

  // Other rental-related methods
}

