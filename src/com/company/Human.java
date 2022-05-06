package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    Car car;
    private Double salary;

    public Double getSalary () {
        System.out.println("Dane o wypłacie były pobrane" + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary) {
        if ( salary < 0) {
            System.out.println("chyba coś jest nie halo, nie ma niewolnictwa");
        } else {
            System.out.println("nowa wypłata wysłana do systemu księgowego");
            System.out.println("odbierz aneks od Pani Hani");
            System.out.println("nie ukrywaj dochódw, ZUS i US i tak cię znajdą");
            this.salary = salary;
        }
    }
}
