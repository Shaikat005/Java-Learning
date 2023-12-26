package com.mycompany.basicjava;

public class OOP_Class_Object {
    public static void main(String[] args){
        Teacher teacher1=new Teacher();
        
        teacher1.name="Hasan Nawab";
        teacher1.gender="Male";
        teacher1.age=23;
        
        System.out.println("Name:"+teacher1.name);
        System.out.println("Gender:"+teacher1.gender);
        System.out.println("Age:"+teacher1.age);
        
        Teacher teacher2=new Teacher();
        
        teacher2.name="Abdul Nawab";
        teacher2.gender="Male";
        teacher2.age=22;
        
        System.out.println("Name:"+teacher2.name);
        System.out.println("Gender:"+teacher2.gender);
        System.out.println("Age:"+teacher2.age);
    }
}
