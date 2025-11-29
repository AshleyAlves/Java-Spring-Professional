package com.devsuperior.dscommerce.repositories;


import com.devsuperior.dscommerce.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
