package dev.sudohub.nau;


class Human {
    public static String Specie = "Homo Sapiens"; //every human is homo sapiens 
    public String Name; //every human has own name
    public Human(String name){
        Name = name;
    }
}

public class StaticvsDynamic {
    public static void Main(String[] args){
        Human alice = new Human("Alice");
        Human bob = new Human("Bob");
        System.out.println(alice.Specie);
        System.out.println(bob.Specie); 
        
        System.out.println(alice.Name);
        System.out.println(bob.Name);
            
    }
}
