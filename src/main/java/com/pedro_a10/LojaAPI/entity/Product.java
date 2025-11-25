package com.pedro_a10.LojaAPI.entity;

import com.pedro_a10.LojaAPI.enums.ProductType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  private String name;

  @NotEmpty
  private Integer priceInCents;

  private byte[] image;

  @Enumerated(EnumType.STRING)
  private ProductType type;
}
