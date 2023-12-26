package com.mycompany.string_prac;

public class NumberConversion2 {
    public static void main(String[] args){
        String Binary="1010";
        Integer decimal=Integer.parseInt(Binary,2);
        System.out.println("Decimal value="+decimal);
        
        Integer octal=Integer.parseInt(Binary,8);
        System.out.println("Octal value="+octal);
        
        Integer hexa=Integer.parseInt(Binary,16);
        System.out.println("Hexadecimal value="+hexa);
    }
}
