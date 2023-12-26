package com.mycompany.string_prac;
public class String_demo3 {
    public static void main(String[] args){
        String country="Bangladesh is my country.";
        System.out.println(country);
        
        //charAt(index) returns the value in that particular index:
        char ch=country.charAt(5);
        System.out.println("ch= "+ch);
        //codePointAt(index) returns the ASCII vale:
        int value=country.codePointAt(0);
        System.out.println("Value= "+value);
        //indexof("String") returns the index number of that string:
        int pos=country.indexOf("is");
        System.out.println(pos);
        //lastIndexOf()returns the last index number the given character;
        pos=country.lastIndexOf('a');
        System.out.println(pos);
    }
}
