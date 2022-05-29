package com.digitazon.Nike.Demo.controllers;


import com.digitazon.Nike.Demo.dtos.CategoryDto;
import com.digitazon.Nike.Demo.entities.Category;
import com.digitazon.Nike.Demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public List<CategoryDto> showAllCategory(){
        List<Category> categories = categoryRepository.findAll();
        var categoryDto = categories.stream()
                .map(CategoryDto::new)
                .collect(Collectors.toList());
        return categoryDto;
    }
}
