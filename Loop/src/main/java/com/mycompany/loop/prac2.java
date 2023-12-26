package com.mycompany.loop;
import java.util.*;
public class prac2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i,j;
        int[] a=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
            System.out.println("You've printed:");
            for(j=0;j<i;j++)
                System.out.print(a[j]);
        }
        
    }
}
