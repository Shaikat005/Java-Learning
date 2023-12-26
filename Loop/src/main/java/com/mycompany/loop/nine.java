package com.mycompany.loop;
import java.util.*;
public class nine {
    public static void main(String[] args){
        int i=0,n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        while(n!=0)
        {
            n=n/10;
            i++;
        }
        System.out.print(i);
    }
}
