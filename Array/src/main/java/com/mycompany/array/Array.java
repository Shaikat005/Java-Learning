package com.mycompany.array;
import java.util.*;
public class Array {
                public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i,j;
        int[] a=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
            System.out.print("You've printed:");
            
            for(j=0;j<i;j++)
                System.out.printf("%d",a[j]);
        }

    }
}
