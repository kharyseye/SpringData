package com.groupeisi.hibernate.repository;

import com.groupeisi.hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
