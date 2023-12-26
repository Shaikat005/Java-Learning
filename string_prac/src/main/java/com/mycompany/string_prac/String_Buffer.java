package com.mycompany.string_prac;

public class String_Buffer {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Md. Hasan Nawab");
        System.out.println(sb);
        sb.append(" Shaikat");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
    }
}
