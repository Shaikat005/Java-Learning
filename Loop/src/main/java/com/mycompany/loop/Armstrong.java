package com.mycompany.loop;
import static java.lang.Math.pow;
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        n=in.nextInt();
        int temp=n;
        while(n!=0)
        {
            sum=(int) (sum+pow((n%10),3));
            n=n/10;
        }
        if(sum==temp)
            System.out.print("It is a Armstrong number.");
        else
            System.out.print("It is not a armstrong number.");
    }
}
