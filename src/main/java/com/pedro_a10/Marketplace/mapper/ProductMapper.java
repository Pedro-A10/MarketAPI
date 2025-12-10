package com.pedro_a10.Marketplace.mapper;

import com.pedro_a10.Marketplace.dto.productdto.ProductRequestDTO;
import com.pedro_a10.Marketplace.dto.productdto.ProductResponseDTO;
import com.pedro_a10.Marketplace.entity.Product;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

  ProductResponseDTO toResponseDTO(Product product);

  Product toEntity(ProductRequestDTO dto);

  List<ProductResponseDTO> toResponseDTOList(List<Product> products);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(target = "id", ignore = true)
  void updateEntityFromDTO(ProductRequestDTO dto, @MappingTarget Product entity);
}
