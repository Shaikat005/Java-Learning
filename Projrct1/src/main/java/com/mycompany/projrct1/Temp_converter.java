package com.mycompany.projrct1;

import java.util.Scanner;

public class Temp_converter {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
    
        Float C,F;
        int value;
        System.out.print("Enter 1 for C to F\n Enter 2 for F to C:");
        value=in.nextInt();
        if(value==1)
        {
            System.out.print("Enter the value in Celcius: ");
            C=in.nextFloat();
            System.out.printf("Temp in Farenheight is: %.2f",((9*C)/5)+32);
        }
        else if(value==2)
        {
            System.out.print("Enter the value in Farenheight: ");
            F=in.nextFloat();
            C=(5*(F-32)/9);
            System.out.printf("Temp in Celcius is: %.2f",C);
        }
        else
            System.out.print("Invalid.");
    }
    
}
