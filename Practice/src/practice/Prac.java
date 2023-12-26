package practice;
import java.util.*;

class Person{
    String name;
    int Age;
    
    Person(String name,int Age)
    {
        this.name=name;
        this.Age=Age;
        System.out.println("Name= "+name+"    Age= "+Age);
    }
    
    Person(){
        System.out.println("No info!!!");
    }
}

public class Prac{
    public static void main(String[] args) {
        Person p=new Person("Shaikat",23);
    }
}