package com.digitazon.Nike.Demo.dtos;

import com.digitazon.Nike.Demo.entities.Category;
import com.digitazon.Nike.Demo.entities.Product;


public class ProductDto {
    private int id;

    private String name;

    private String description;

    private int originalCost;

    private int cost;

    private int weight;

    private String brand;

    private int unitInStock;

    private int categoryId;

    private String categoryName;

    public ProductDto() {
    }

    public ProductDto(int id, String name, String description, int originalCost, int cost, int weight, String brand, int unitInStock, int categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.originalCost = originalCost;
        this.cost = cost;
        this.weight = weight;
        this.brand = brand;
        this.unitInStock = unitInStock;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public ProductDto(Product p){
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
        this.originalCost = p.getOriginalCost();
        this.cost = p.getCost();
        this.weight = p.getWeight();
        this.brand = p.getBrand();
        this.unitInStock = p.getUnitInStock();
        this.categoryId = p.getCategory().getId();
        this.categoryName = p.getCategory().getName();
    }
    public Product toProduct() {
        var cat = new Category();
        cat.setId(this.categoryId);
        var p = new Product(
                this.id,this.name,this.description,this.originalCost,this.cost,this.weight,this.brand,this.unitInStock,cat
        );
        return p;

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

    public int getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(int originalCost) {
        this.originalCost = originalCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
