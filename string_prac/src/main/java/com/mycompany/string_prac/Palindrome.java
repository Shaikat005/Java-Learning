package com.mycompany.string_prac;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        String s1;
        Scanner in=new Scanner(System.in);
        s1=in.next();
        StringBuffer sb=new StringBuffer(s1);
        String s2=sb.reverse().toString();
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}