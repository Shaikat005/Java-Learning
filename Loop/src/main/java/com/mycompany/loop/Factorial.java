package com.mycompany.loop;
import java.util.*;
public class Factorial {
    public static void main(String[] argas){
        Scanner in=new Scanner(System.in);
        int n,i,sum=1;
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        System.out.print(sum);
    }
}
