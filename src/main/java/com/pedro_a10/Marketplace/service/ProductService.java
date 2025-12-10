package com.pedro_a10.Marketplace.service;

import com.pedro_a10.Marketplace.dto.productdto.ProductRequestDTO;
import com.pedro_a10.Marketplace.dto.productdto.ProductResponseDTO;
import com.pedro_a10.Marketplace.entity.Product;
import com.pedro_a10.Marketplace.enums.ProductType;
import com.pedro_a10.Marketplace.exceptions.ProductInvalidQuantityException;
import com.pedro_a10.Marketplace.exceptions.ProductNotFoundException;
import com.pedro_a10.Marketplace.mapper.ProductMapper;
import com.pedro_a10.Marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  ProductRepository productRepository;

  @Autowired
  ProductMapper productMapper;

  public ProductResponseDTO findById(Long id) {
    Product product = productRepository.findById(id)
      .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    return productMapper.toResponseDTO(product);
  }

  public ProductResponseDTO findByName(String name) {
    Product productName = productRepository.findByName(name)
      .orElseThrow(() -> new ProductNotFoundException("Product not found with name: " + name));
    return productMapper.toResponseDTO(productName);
  }

  public List<ProductResponseDTO> findByPriceInCents(Integer priceInCents) {
    return productMapper.toResponseDTOList(productRepository.findByPriceInCents(priceInCents));
  }

  public List<ProductResponseDTO> findAllByType(ProductType type) {
    return productMapper.toResponseDTOList(productRepository.findAllByType(type));
  }

  public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
    if (productRequestDTO.getQuantity() <= 0){
      throw new ProductInvalidQuantityException("Is not possible create products with 0 or below quantity: " + productRequestDTO.getQuantity());
    }

    Product products = productMapper.toEntity(productRequestDTO);
    Product saveProducts = productRepository.save(products);
    return productMapper.toResponseDTO(saveProducts);
  }

  public void deleteById(Long id) {
    if (!productRepository.existsById(id)) {
      throw new ProductNotFoundException("Product not found with id: " + id);
    }
    productRepository.deleteById(id);
  }
}
