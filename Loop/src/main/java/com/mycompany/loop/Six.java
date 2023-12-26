
package com.mycompany.loop;
import java.lang.Math;
import java.util.*;
public class Six {
    public static void main(String[] args){
        int sum = 0,i;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the last digit:");
        int n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=(int) (sum+Math.pow(i,2));
        }
        System.out.print(sum);
    }
}
