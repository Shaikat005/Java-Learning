package com.mycompany.method;
public class Setter_getter {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public static void main(String[] args){
        Setter_getter ob1=new Setter_getter();
        ob1.name="Shaikat";
        ob1.age=23;
        System.out.println(ob1.getName());
        System.out.println(ob1.getAge());
    }
}
