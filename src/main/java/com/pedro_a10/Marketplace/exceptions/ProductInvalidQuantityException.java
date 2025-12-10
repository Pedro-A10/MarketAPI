package com.pedro_a10.Marketplace.exceptions;

public class ProductInvalidQuantityException extends RuntimeException {
  public ProductInvalidQuantityException(String message) {
    super(message);
  }
}
