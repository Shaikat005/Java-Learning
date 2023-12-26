package com.mycompany.string_prac;
public class String_demo4{
    public static void main(String[] args){
        String s1="Bangladesh is moy country.";
        //replace() method:
        String s2=s1.replace('a', 'i');
        System.out.println(s2);
        
        //split() method:
        String[] s3=s1.split(" ");
        for(String x:s3)
            System.out.println(x);
}
}
