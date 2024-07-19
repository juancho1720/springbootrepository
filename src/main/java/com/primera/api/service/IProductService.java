package com.primera.api.service;

import com.primera.api.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll();

    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    Optional<Product> findById(Long id);

    void save(Product product);

    void deleteById(Long id);
}
