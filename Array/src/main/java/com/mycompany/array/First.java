package com.mycompany.array;
import java.util.*;
public class First {
    public static void main(String[] args){
        int i;
        int[] a=new int[10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        int len=a.length;
        System.out.println("Length of array: "+len);
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
