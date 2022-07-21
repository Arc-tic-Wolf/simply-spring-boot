package com.example.dummy.service;

import com.example.dummy.model.Client;
import com.example.dummy.repository.ClientRepoV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    ClientRepoV2 repo;

    public void addClient(long id,String firstName, String lastName,String role){
        Client client=new Client(id,firstName,lastName,role);
        repo.save(client);
    }

    public void setFirstName(Client client,String firstName){
        client.setFirstName(firstName);
        repo.save(client);
    }
}
