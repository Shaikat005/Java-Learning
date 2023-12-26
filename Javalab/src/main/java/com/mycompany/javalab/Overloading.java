package com.mycompany.javalab;
public class Overloading {
    String name;
    int age;
    int id;
    void Display(String N,int A){
        N=name;
        A=age;
        System.out.println("Name= "+name+" Age= "+age);
    }
    
    void Display(String N,int A,int I){
        N=name;
        A=age;
        I=id;
        System.out.println("Name= "+name+" Age= "+age+" Id= "+id);
    }
    
    public static void main(String[] args) {
            Overloading ob1=new Overloading();
            ob1.name="Shaikat";
            ob1.age=23;
            ob1.id=2102005;
            ob1.Display(ob1.name,ob1.age,ob1.id);
            ob1.Display(ob1.name,ob1.age);
    }
}
