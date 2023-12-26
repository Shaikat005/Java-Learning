package com.mycompany.method;

public class Inheritance_Test extends Inheritance{
    String Qualification;
    void Display2(){
        System.out.println("Name= "+name);
        System.out.println("Age= "+age);
        System.out.println("Qualification= "+Qualification);
    }
    
    public static void main(String[] args) {
        Inheritance_Test ob1=new Inheritance_Test();
        ob1.name="Shaikat";
        ob1.age=23;
        ob1.Qualification="B.Sc undergraduate";
        ob1.Display2();
        ob1.Display();
        
    }
}
