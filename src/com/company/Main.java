package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.species = "canis";
        dog.isAlive = true;
        dog.name = "Szarik";
        dog.weight = 10.0;

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + "name: " + dog.name);

        Animal cat = new Animal("felis");
        cat.species = "felis";
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("ten kot to " + cat.name);
        cat.weight = 0.0;
        System.out.println(cat.weight);

        dog.feed();


        System.out.println(dog.weight);

        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();

        System.out.println(dog.weight);

        dog.feed();

        Human dawid = new Human();
        dawid.firstName = "Dawid";
        dawid.lastName = "Beczek";

        Car fiat = new Car ("bravo","fiat");
        Car passat = new Car("passat","vw");








        Phone iphone6s = new Phone();
        iphone6s.producer = "Apple";
        iphone6s.model = "6s";
        iphone6s.screenSize = 4.2;
        iphone6s.os = "ios";

        System.out.println(iphone6s.producer + " " + iphone6s.model);





    }


}
