package com.digitazon.Nike.Demo.entities;


import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String description;

    private int originalCost;

    private int cost;

    private int weight;

    private String brand;

    private int unitInStock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product () {

    }

    public Product(int id, String name, String description, int originalCost, int cost, int weight, String brand, int unitInStock, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.originalCost = originalCost;
        this.cost = cost;
        this.weight = weight;
        this.brand = brand;
        this.unitInStock = unitInStock;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
