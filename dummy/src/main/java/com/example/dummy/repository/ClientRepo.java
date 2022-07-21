package com.example.dummy.repository;

import com.example.dummy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {
    Client findByFirstName(String firstName);

}