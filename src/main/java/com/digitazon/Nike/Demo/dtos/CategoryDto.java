package com.digitazon.Nike.Demo.dtos;

import com.digitazon.Nike.Demo.entities.Category;

public class CategoryDto {
    private int id;

    private String name;

    private String description;

    private int numberOfProducts;

    public CategoryDto() {
    }

    public CategoryDto(Category c) {
        this.id = c.getId();
        this.name = c.getName();
        this.description = c.getDescription();
        this.numberOfProducts = c.getProducts().size();

    }

    public CategoryDto(int id, String name, String description, int numberOfProducts) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numberOfProducts = numberOfProducts;
    }

    public Category toCategory() {
        return new Category(this.id, this.name, this.description);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
