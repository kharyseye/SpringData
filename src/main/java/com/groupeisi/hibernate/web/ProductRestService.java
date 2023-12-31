package com.groupeisi.hibernate.web;

import com.groupeisi.hibernate.entities.Product;
import com.groupeisi.hibernate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/list")
    public List<Product> products(){
        return productRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Product findProduct(@PathVariable Long id){
       return productRepository.findById(id).get();
    }
}
