package com.example.dummy.controller;

import com.example.dummy.model.Client;
import com.example.dummy.repository.ClientRepo;
import com.example.dummy.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ClientControl {

    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private WebService webClient;

    @GetMapping("clients")
    public List<Client> getAllClient(){
        System.out.println(webClient.getWeb());
        return this.clientRepo.findAll();

    }
}
