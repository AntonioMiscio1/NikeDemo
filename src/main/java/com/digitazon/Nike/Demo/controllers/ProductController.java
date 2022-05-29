package com.digitazon.Nike.Demo.controllers;


import com.digitazon.Nike.Demo.dtos.ProductDto;
import com.digitazon.Nike.Demo.entities.Product;
import com.digitazon.Nike.Demo.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<ProductDto> all() {
        List<Product> products = productRepository.findAll();

        var productsDto = products.stream()
                .map(ProductDto::new)
                .collect(Collectors.toList());
        return productsDto;
    }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto newProductDto) {
        var product = newProductDto.toProduct();
        var saved = productRepository.save(product);
        var savedDto = new ProductDto(saved);
        return savedDto;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        productRepository.deleteById(id);
        return "ok";
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @RequestBody Product updateProduct) throws Exception {
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(updateProduct.getName());
        product.setDescription(updateProduct.getDescription());
        product.setOriginalCost(updateProduct.getOriginalCost());
        product.setCost(updateProduct.getCost());
        product.setWeight(updateProduct.getWeight());
        product.setBrand(updateProduct.getBrand());
        product.setUnitInStock(updateProduct.getUnitInStock());
        product.setCategory(updateProduct.getCategory());
        return productRepository.save(product);
    }

}



