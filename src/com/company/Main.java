package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.isAlive = true;
        dog.name = "Szarik";


        System.out.println(dog.name);
        System.out.println("species: " + dog.species + "name: " + dog.name);

        Animal cat = new Animal("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        Human dawid = new Human();
        dawid.setCar(new Car("brawo", "fiat"));


        dawid.firstName = "Dawid";
        dawid.lastName = "Beczek";
        dawid.pet = dog;
        dawid.mobile = new Phone();

        dawid.mobile.model = "6s";
        dawid.mobile.producer = "apple";
        dawid.pet.feed();

        dawid.setCar(new Car("passat","vw"));
        System.out.println(dawid.getCar().millage);

        dawid.setSalary(1000.0);
        System.out.println(dawid.getSalary());






    }


}
