package com.example.dummy;


import com.example.dummy.model.Client;
import com.example.dummy.repository.ClientRepoV2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DummyApplication {



    public static void main(String[] args) {
        SpringApplication.run(DummyApplication.class, args);
    }

    @Bean
    public CommandLineRunner dummy(ClientRepoV2 repo){
        return args -> {
            // fetch all clients
            System.out.println("Clients found with findAll():");
            System.out.println("-------------------------------");
            for (Client client : repo.findAll()) {
                System.out.println(client.toString());
            }
            System.out.println("");

            // fetch an individual client by ID
            Client client= repo.findById(5L);
            System.out.println("Client found with findById(5L):");
            System.out.println("--------------------------------");
            System.out.println(client.toString());
            System.out.println("");

            // fetch clients by first name
            System.out.println("Client found with findByFirst_name('John'):");
            System.out.println("--------------------------------------------");
            repo.findByFirstName("John").forEach(c -> {
                System.out.println(c.toString());
            });
        };
    }


}
