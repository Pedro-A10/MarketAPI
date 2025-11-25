package com.pedro_a10.LojaAPI.repository;

import com.pedro_a10.LojaAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findById(Long id);

  Optional<User> findByCpf(String cpf);

  boolean existsByEmail(String email);

  @Query("SELECT u FROM User u WHERE u.isEmployee = false")
  List<User> listUserClient();

  @Query("SELECT u FROM User u WHERE u.isEmployee = true")
  List<User> listUserEmployee();
}
