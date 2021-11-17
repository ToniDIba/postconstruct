package com.example.postconstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import javax.annotation.PostConstruct;

@SpringBootApplication
public class PostconstructApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostconstructApplication.class, args);
    }


    @PostConstruct
    public void ejecutar() {
       System.out.println("\n " + "------------------- Ejecutado tras crear Bean -----------------------------" + "\n");
    }

}
