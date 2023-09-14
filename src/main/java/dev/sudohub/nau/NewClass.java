package dev.sudohub.nau;

class MyType { // оголошується клас
    public int myData = 5; // змінна-елемент класу

    MyType() { // конструктор без параметрів
        System.out.println("Constructor without parameters");
    }

    MyType(int v) { // конструктор з одним параметром
        System.out.print("Constructor with one parameter");
        System.out.println(" Setting myData="+v);
        myData=v;
    }

    public void myMethod() { // метод класу
    System.out.print("myMethod!");
    System.out.println(" myData="+myData);
    }
}

// Реалізація об’єктів та дії з ними
public class NewClass { // первинний клас
    public static void main(String[] args) {
    // об’єкт obj1 - реалізація класу MyType
    MyType obj1=new MyType();
    obj1.myMethod(); // використання метода

    // доступ до відкритої змінної
    System.out.println("---obj1.myData="+obj1.myData);
    // об’єкт obj2 - реалізація класу MyType
    MyType obj2=new MyType(100);
    // доступ до відкритої змінної
    System.out.println("----obj2.myData="+obj2.myData);
    }
}