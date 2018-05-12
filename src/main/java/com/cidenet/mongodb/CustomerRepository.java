package com.cidenet.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByLastName(@Param("name") String name);
    List<Customer> findByFirstName(@Param("fname") String name);
    List<Customer> findByAgeAfter(@Param("age") int age);
    List<Customer> findByCountry(@Param("country") String country);
    List<Customer> findBySalarioBefore(@Param("salario") int salario);
    List<Customer> findBySalarioAfter(@Param("salario") int salario);

}
