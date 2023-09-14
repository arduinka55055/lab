package dev.sudohub.nau;

import java.util.ArrayList;
import dev.sudohub.nau.Zoo.Animal;
import dev.sudohub.nau.Zoo.Dog;
import dev.sudohub.nau.Zoo.Cat;

public class PolymorphismTest {
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void printZoo(){
        for (Animal animal : animals) {
            System.out.print(animal.getClass().getName() + " says:"); 
            animal.makeSound();
        }
    }
    public static void main(String[] args) {
        animals.add(new Dog());
        animals.add(new Cat("Tom"));//upcasting a cat to just an animal
        animals.add(new Animal());
        printZoo();
        
        //downcasting
        ((Cat)animals.get(1)).setName("Jerry");

        printZoo();


    }
}
