package com.cidenet.mongodb;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String country;
    public int age;
    public String profesion;
    public int salario;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }




    public Customer() {
    }

    public Customer(String firstName, String lastName, String country, int age, String profesion, int salario ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country=country;
        this.age= age;
        this.profesion=profesion;
        this.salario=salario;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName, country, age, profesion, salario);
    }

}
