package com.boostmytool.beststore.repo;

import com.boostmytool.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Product,Integer> {
}
