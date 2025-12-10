package com.pedro_a10.Marketplace.dto.userdto;

import lombok.Data;

@Data
public class UserResponseDTO {

  private Long id;
  private String username;
  private String email;
  private String address;
  private boolean isEmployee;
}
