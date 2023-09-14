package dev.sudohub.nau;

public class Student {
    Student() {
        System.out.println("Student constructor");
    }
    
    private String name = "makogon";
    private int age = 20;

    public String getName() {
        return name + " ( a student )";
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 18) {
            System.out.println("You are too young to be a student");
        } else {
            this.age = age;
        }
    }
}
