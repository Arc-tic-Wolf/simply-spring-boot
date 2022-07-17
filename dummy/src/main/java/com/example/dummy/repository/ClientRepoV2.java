package com.example.dummy.repository;

import com.example.dummy.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepoV2 extends CrudRepository<Client, Long> {

    List<Client> findByFirstName(String firstName);


    Client findById(long id);
}