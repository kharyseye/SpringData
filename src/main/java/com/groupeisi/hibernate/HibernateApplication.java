package com.groupeisi.hibernate;

import com.groupeisi.hibernate.entities.Product;
import com.groupeisi.hibernate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {
    @Autowired
    ProductRepository productRepository ;

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null,"mouse", 100, 3000));
        //productRepository.save(new Product(null,"USB", 250, 15000));
        //productRepository.save(new Product(null,"Keyboard", 90, 5000));

        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });

    }
}
