package com.example.postconstruct;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class Runner1 implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("\n" + "-------------------- Hola desde clase secundaria -----------------------" + "\n");
    }
}
