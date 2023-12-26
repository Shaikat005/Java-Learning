package com.mycompany.javalab;
public class Cons_over {
    int a,b,c;
    Cons_over(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    Cons_over(int x,int y,int z){
        x=a;
        y=b;
        z=c;
    }
    void display(){

        System.out.println(a+b);
    }
    
    void display1(){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Cons_over ob1=new Cons_over(10,20);
        Cons_over ob2=new Cons_over(10,20,30);
        ob1.display();
        ob2.display1();
    }
   
}
