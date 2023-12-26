
package com.mycompany.loop;
import java.util.*;
public class prac3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i,j,temp;
        n=in.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

}
}
