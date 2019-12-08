package com.pavelsamsonenka.Shops.repos;

import com.pavelsamsonenka.Shops.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
