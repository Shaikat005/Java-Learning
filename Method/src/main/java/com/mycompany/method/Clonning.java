package com.mycompany.method;

public class Clonning {
    String name;
    int age;
    
    Clonning(String name,int age){
        this.name=name;
        this.age=age;
    }
    void print(){
        System.out.println(name);
        System.out.println(age);
    }
    
    public static void main(String[] args) throws CloneNotSupportedException{
        Clonning ob1=new Clonning("Shaikat",22);
        ob1.print();
        Clonning ob2=(Clonning) ob1.clone();
        ob2.print();
    }
}
