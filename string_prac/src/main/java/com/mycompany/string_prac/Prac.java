package com.mycompany.string_prac;
import java.util.*;
public class Prac{
    String name,gender;
    int age;
    void setinfo(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    void display(){
        System.out.println("Name="+name);
        System.out.println("Gender="+gender);
        System.out.println("Age="+age);
    }
}
