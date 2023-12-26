package com.mycompany.array;
import java.util.*;
public class Sum_Avg {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        n=in.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
        System.out.println("The sum= "+sum);
        System.out.println("The average= "+(sum/n));
    }
}
