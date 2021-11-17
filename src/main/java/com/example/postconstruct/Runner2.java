package com.example.postconstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)

public class Runner2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        //System.out.println("\n" + "-------------------- Soy la tercera clase --------------------- ");
        System.out.println("\n" + "-------------------- Parámetros entrada: " + args[0] + " " + args[1] + " " + args[2]);

    }
}

