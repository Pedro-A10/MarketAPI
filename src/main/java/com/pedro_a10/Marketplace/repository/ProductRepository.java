package com.pedro_a10.Marketplace.repository;

import com.pedro_a10.Marketplace.entity.Product;
import com.pedro_a10.Marketplace.enums.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

  Optional<Product> findById(Long id);

  Optional<Product> findByName(String name);

  List<Product> findByPriceInCents(Integer priceInCents);

  List<Product> findAllByType(ProductType type);
}
