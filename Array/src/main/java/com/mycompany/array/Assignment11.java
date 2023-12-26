package com.mycompany.array;
import java.util.*;
public class Assignment11 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] day={"Sturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        int n;
        System.out.print("Please enter a number between 1-7:");
        n=in.nextInt();
        if(n==1)
            System.out.print(day[0]);
        else if(n==2)
            System.out.print(day[1]);
        else if(n==3)
            System.out.print(day[2]);
        else if(n==4)
            System.out.print(day[3]);
        else if(n==5)
            System.out.print(day[4]);
        else if(n==6)
            System.out.print(day[5]);
        else if(n==7)
            System.out.print(day[6]);
    }
}
