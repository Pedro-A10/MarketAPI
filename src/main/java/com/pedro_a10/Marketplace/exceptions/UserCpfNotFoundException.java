package com.pedro_a10.Marketplace.exceptions;

public class UserCpfNotFoundException extends RuntimeException {
  public UserCpfNotFoundException(String message) {
    super(message);
  }
}
