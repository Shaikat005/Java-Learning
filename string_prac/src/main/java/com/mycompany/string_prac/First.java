package com.mycompany.string_prac;

public class First {
    public static void main(String[] args){
        String s1="Shaikat is a student.";
        String s2="I mean bad student.";
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.concat(s2));
        if(s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        
        if(s1.contains("Shaikat"))
            System.out.println("Contains");
        else
            System.out.println("does not contains.");
    }
}
