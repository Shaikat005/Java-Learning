package com.mycompany.method;

public class Array_of_obj {
    String name;
    int age;
    
    public static void main(String[] args){
        Array_of_obj ob1=new Array_of_obj();
        ob1.name="Shaikat";
        ob1.age=22;
        
        Array_of_obj ob2=new Array_of_obj();
        ob2.name="Shaikat";
        ob2.age=22;
        
        Array_of_obj ob3=new Array_of_obj();
        ob3.name="Shaikat";
        ob3.age=22;
        
        Array_of_obj objects[]=new Array_of_obj[3];
        objects[0]=ob1;
        objects[1]=ob2;
        objects[2]=ob3;
        
        for(int i=0;i<objects.length;i++){
            System.out.println(objects[i].name+" : "+objects[i].age);
        }
    }
}
