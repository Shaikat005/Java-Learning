package com.mycompany.array;
import java.util.*;
public class Max_min {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i,max,min;
        n=in.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        max=a[0];
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }
}
