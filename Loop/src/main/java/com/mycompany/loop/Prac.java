package com.mycompany.loop;
import java.util.*;
public class Prac {
    public static void main(String[] args){
        char[] ch=new char[10];
        int i;
        Scanner in=new Scanner(System.in);
        for(i=0;i<10;i++)
            ch[i]=in.next().charAt(0);
        for(i=0;i<10;i++)
            System.out.print(ch[i]+" ");
    }
}
