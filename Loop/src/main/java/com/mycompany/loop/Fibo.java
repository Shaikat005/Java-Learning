package com.mycompany.loop;
import java.util.*;
public class Fibo {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int first=0,second=1,n,i,fibo;
        n=in.nextInt();
        System.out.printf("%d %d ",first,second);
        for(i=2;i<n;i++)
        {
            fibo=first+second;
            first=second;
            second=fibo;
            System.out.print(fibo+" ");
        }
    }
}
