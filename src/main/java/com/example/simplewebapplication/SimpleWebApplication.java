package com.example.simplewebapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner (ApplicationContext ctx){
        return args -> {
            System.out.println("Let's inspect Spring Boot");
            String[] beanNames = ctx.getBeanDefinitionNames();
            for (String name : beanNames){
                System.out.println(name);
            }

        };
    }
}
