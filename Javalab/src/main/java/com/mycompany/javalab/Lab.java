package com.mycompany.javalab;
public class Lab {
    double width;
    double height;
    double depth;
    void set(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    void display(){
        System.out.println(width);
        System.out.println(height);
        System.out.println(depth);
    }
    void set(double h1,double w1){
        height=h1;
        width=w1;
    }
    void display1(){
        System.out.println(width);
        System.out.println(height);
        System.out.println(depth);
    }
    
    double volume(double width,double height,double depth){
        return width*height*depth;
    }
    public static void main(String[] args){
        Lab ob1=new Lab();
        ob1.width=15.5;
        ob1.height=20.0;
        ob1.depth=5.67;
        double v=ob1.volume(ob1.width, ob1.height, ob1.depth);
        ob1.set(ob1.width, ob1.height, ob1.depth);
        ob1.display();
        ob1.set(ob1.width, ob1.height, ob1.depth);
        ob1.display1();
        System.out.println("Volume= "+v);
        
    }
}
