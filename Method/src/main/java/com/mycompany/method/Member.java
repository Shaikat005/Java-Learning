//Demo of parameterized method:
package com.mycompany.method;

public class Member {
    String name,gender;
    int Age;
    
    void Information(String n,String g,int a){
        name=n;
        gender=g;
        Age=a;
    }
    
    void print(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(Age);
        System.out.println("\n");
    }
    public static void main(String[] args){
        Member ob1=new Member();
        ob1.name="Shaikat";
        ob1.gender="Male";
        ob1.Age=23;
        ob1.Information(ob1.name,ob1.gender,ob1.Age);
        ob1.print();
    }
}
