package org.example.inheritance.animal;

import java.util.Arrays;

public class Zookeeper {

    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal reptile = new Reptile();

        bird.setAge(12);
        fish.setAge(2);
        reptile.setAge(10);

        ((Fish)fish).swim();

        System.out.println(bird);
        System.out.println(fish);
        System.out.println(reptile);
    }
}
