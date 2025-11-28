package com.pedro_a10.LojaAPI.entity;

import com.pedro_a10.LojaAPI.enums.ProductType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  private String name;

  @NotNull
  @Min(1)
  private Integer quantity;

  @NotNull
  @Min(0)
  private Integer priceInCents;

  private byte[] image;

  @Enumerated(EnumType.STRING)
  private ProductType type;
}
