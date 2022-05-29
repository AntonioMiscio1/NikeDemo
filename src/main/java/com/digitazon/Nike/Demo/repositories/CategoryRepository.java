package com.digitazon.Nike.Demo.repositories;

import com.digitazon.Nike.Demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Integer> {
}
