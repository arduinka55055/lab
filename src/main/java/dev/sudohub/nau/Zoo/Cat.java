package dev.sudohub.nau.Zoo;

public class Cat extends Animal {
    //incapsulation
    private String name;
    public String getName() {
        return this.name + " the cat";
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public Cat(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Meow from " + this.getName());
    }
}