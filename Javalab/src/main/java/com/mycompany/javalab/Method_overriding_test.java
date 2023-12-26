package com.mycompany.javalab;
import java.util.*;
public class Method_overriding_test extends Method_overriding {
    int id;
    @Override
    void Display(String name, int age){
        System.out.println("Name= "+name+" Age= "+age);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Method_overriding_test ob1= new Method_overriding_test();
        ob1.name=in.nextLine();
        ob1.age=in.nextInt();
        ob1.Display(ob1.name,ob1.age);
    }
}
