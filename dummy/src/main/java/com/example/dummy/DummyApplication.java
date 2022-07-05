package com.example.dummy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DummyApplication {


    public static void main(String[] args) {
        SpringApplication.run(DummyApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner cmdRun(ApplicationContext context){
//        return args -> {
//            System.out.println("Inspection of beans");
//
//            String[] beanNames = context.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }


}
