package com.primera.api.repository;

import com.primera.api.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    //Usamos lenguaje JPQL
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    //Usando query method
    //List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
