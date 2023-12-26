package com.mycompany.loop;
import java.util.*;
public class Pyramid {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i,j;
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        
        for(i=n-1;i>=1;i--)
        {
            for(j=n-i;j>=1;j--)
                System.out.print(" ");
            for(j=2*i-1;j>=1;j--)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
