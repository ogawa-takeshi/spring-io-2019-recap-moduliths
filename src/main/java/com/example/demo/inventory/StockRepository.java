package com.example.demo.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StockRepository extends JpaRepository<Stock, UUID> {
}
