
package com.mycompany.loop;


import java.util.*;
public class Mul_table {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.println("Enter a number:");
        n=in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}
