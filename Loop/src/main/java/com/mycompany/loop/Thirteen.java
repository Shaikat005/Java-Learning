package com.mycompany.loop;
import java.util.*;
public class Thirteen {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter a number:");
        n=in.nextInt();
        while(n!=0)
        {   
            System.out.printf("%d ",n%10);
            n=n/10;
            
        }
        
    }
}
