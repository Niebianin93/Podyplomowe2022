package com.company;

import java.sql.SQLOutput;

public class Animal {
   final String species;
    private Double weight;
    Integer age;
    String name;
    Boolean isAlive;

    static public Double DEFAULT_WEIGHT = 5.0;

    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;




        switch (this.species){
            case "felis":this.weight = 2.0; break;
            case "canis":this.weight = 10.0; break;
            default: this.weight = 5.0; break;

        }

    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("troche za późno");
        } else {

            weight += 1.0;
            System.out.printf("thx for food ");
        }
    }

    void takeForWalk() {
        if (weight <= 0.0) {
            System.out.println("halo policja, ktoś targa martwe zwierzę po chodniku");
        } else {
            weight -= 1.0;
            System.out.printf("nice walk, thx ");
        }
    }
}