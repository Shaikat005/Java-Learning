package com.mycompany.string_prac;

public class WrapperDemo {
    public static void main(String[] aregs){
        //primitive to object:(Autoboxing)
        int x=30;
        Integer y=Integer.valueOf(x);
        System.out.println(y);
        
        //object to primitive:(Unboxing)
        Double D=2.145;
        double d=D.doubleValue();
        System.out.println(d);
    }
}
