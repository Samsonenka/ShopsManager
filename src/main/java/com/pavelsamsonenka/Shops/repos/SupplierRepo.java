package com.pavelsamsonenka.Shops.repos;

import com.pavelsamsonenka.Shops.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Integer> {
}
