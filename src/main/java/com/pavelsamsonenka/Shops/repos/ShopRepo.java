package com.pavelsamsonenka.Shops.repos;

import com.pavelsamsonenka.Shops.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends JpaRepository<Shop, Integer> {
}
