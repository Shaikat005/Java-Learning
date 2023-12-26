package com.mycompany.method;
public class Constructor {
    String name,gender;
    int age;
    Constructor(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    void print(){
        System.out.println("Name= "+name);
        System.out.println("Gender= "+gender);
        System.out.println("Age= "+age);
    }
}
