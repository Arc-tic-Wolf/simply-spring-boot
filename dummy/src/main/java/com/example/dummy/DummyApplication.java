package com.example.dummy;


import com.example.dummy.model.Client;
import com.example.dummy.repository.ClientRepo;
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

//    @Bean
//    public CommandLineRunner dummy(ClientRepo repo){
//        return args -> {
//            // fetch all clients
////            System.out.println("Clients found with findAll():");
////            System.out.println("-------------------------------");
////            for (Client client : repo.findAll()) {
////                System.out.println(client.toString());
////            }
////            System.out.println();
//
//
////            System.out.println();
////            repo.save(Client.builder()
////                            .firstName("som")
////                            .lastName("webapps")
////                            .role("web")
////                    .build());
////            Client tom = repo.findByRole("web");
////            tom.setRole("website");
////            repo.save(tom);
////            System.out.println(client.toString());
////
////
//        };
//    }


}
