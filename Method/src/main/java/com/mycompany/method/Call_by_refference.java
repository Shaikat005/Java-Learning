package com.mycompany.method;
public class Call_by_refference {
    int x;
    void change(Call_by_refference r2){
        r2.x=20;
    }
    public static void main(String[] args){
        Call_by_refference r1=new Call_by_refference();
        r1.x=10;
        System.out.println("Before calling x="+r1.x);
        r1.change(r1);
        System.out.println("After calling x="+r1.x);
    }
}
