package com.mycompany.method;
public class Call_by_Value {
    void value(int i){
        i=20;
    }
    public static void main(String[] args){
        Call_by_Value ob1=new Call_by_Value(); 
        int x=10;
        System.out.println("Before calling x="+x);
        ob1.value(x);
        System.out.println("After Calling x="+x);
    }
}
