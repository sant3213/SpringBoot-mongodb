package com.cidenet.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



/*
    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer("Alice", "Smith", "us", 20, "ing sistemas", 1000));
        repository.save(new Customer("Bob", "Smith", "canada", 34, "ing industrial", 1500));
        repository.save(new Customer("martin", "Garrix", "Alemania", 30, "ing electrica", 2500));
        repository.save(new Customer("Marilyn", "Getriot", "canada", 23, "ing sistemas", 1300));
        repository.save(new Customer("Margot", "Restrepo", "Colombia", 40, "ing mecanica", 3000));
        repository.save(new Customer("Daniel", "Garrix", "Peru", 42, "diseño industrial", 1800));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

    }
*/
}

