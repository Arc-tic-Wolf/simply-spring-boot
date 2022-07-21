package com.example.dummy.controller;

import com.example.dummy.model.Client;
import com.example.dummy.repository.ClientRepo;
import com.example.dummy.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
//        System.out.println(webClient.getWeb());
        return this.clientRepo.findAll();

    }

    @GetMapping("client/{id}")
    public ResponseEntity<Client> clientById(@PathVariable(value="id") Long clientId) throws Exception{
        Client client=clientRepo.findById(clientId).orElseThrow(() -> new Exception(clientId+" 404"));
        return ResponseEntity.ok().body(client);
    }

    @PostMapping("add_client")
    public Client addClient(@RequestBody Client client){
        return this.clientRepo.save(client);
    }

    @PutMapping("up_client/{id}")
    public ResponseEntity<Client> upClient(@PathVariable(value="id") Long clientId, @RequestBody Client clientInfo) throws Exception{
        Client client=clientRepo.findById(clientId).orElseThrow(() -> new Exception(clientId+ " 404"));
        client.setFirstName(clientInfo.getFirstName()==null?client.getFirstName(): clientInfo.getFirstName());
        client.setLastName(clientInfo.getLastName()==null?client.getLastName(): clientInfo.getLastName());
        client.setRole(clientInfo.getRole()==null?client.getRole(): clientInfo.getRole());

        return ResponseEntity.ok(this.clientRepo.save(client));
    }


}
