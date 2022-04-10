package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;


    private Double salary;

    public Double getSalary () {

        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
