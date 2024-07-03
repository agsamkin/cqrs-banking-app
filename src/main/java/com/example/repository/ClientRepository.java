package com.example.repository;

import com.example.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    boolean existsByUsername(String username);

}
