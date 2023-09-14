package dev.sudohub.nau;

/**
 * 
 *
 */
public class App  
{
    public static void main( String[] args )
    {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.setName("makogon");
        student.setAge(20);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.setAge(17);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}