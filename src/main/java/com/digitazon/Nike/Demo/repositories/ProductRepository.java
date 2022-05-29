package com.digitazon.Nike.Demo.repositories;

import com.digitazon.Nike.Demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
