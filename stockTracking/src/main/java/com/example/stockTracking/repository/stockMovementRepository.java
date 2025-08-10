package com.example.stockTracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockTracking.model.stockMovement;

import jakarta.persistence.Id;

@Repository
public interface stockMovementRepository extends JpaRepository<stockMovement, Long> {

	
}
