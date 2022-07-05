package com.example.dummy.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebService {


    private final WebClient webClient;

    public WebService(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://127.0.0.1:9000/").build();
    }

    public String getWeb(){
        return webClient.get().uri("/retrieve").retrieve().bodyToMono(String.class).block();
    }


}