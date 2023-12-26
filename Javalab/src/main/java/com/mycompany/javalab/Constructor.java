package com.mycompany.javalab;
public class Constructor {
    double height;
    double width;
    double depth;
    Constructor(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
        System.out.println(height);
        System.out.println(width);
        System.out.println(depth);
    }
    
    public static void main(String[] args){
        Constructor ob1=new Constructor(20.5,21.3,55.6);
    }
}
