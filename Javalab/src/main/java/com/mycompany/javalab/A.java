package com.mycompany.javalab;
class A {
    int id;
    int age;
    int mark;
    void Display(int id,int age){
        this.id=id;
        this.age=age;
        System.out.println("ID= "+id+"Age= "+age);
    }
    
    void Display(int id,int age,int mark){
        this.id=id;
        this.age=age;
        this.mark=mark;
        System.out.println("ID= "+id+"Age= "+age+" Mark= "+mark);
    }

}
