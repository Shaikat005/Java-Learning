package com.mycompany.projrct1;

import java.util.Scanner;

public class Arithmatic_op {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1,num2,sum,sub,div,mul;
        System.out.println("Enter number1: ");
        num1=in.nextInt();
        System.out.println("Enter number2: ");
        num2=in.nextInt();
        System.out.printf("Sum=%d\n",num1+num2);
        if(num1>num2)
            System.out.printf("Sub=%d\n",num1-num2);
        else
            System.out.printf("Sub=%d\n",num2-num1);
            
        System.out.printf("Div=%f\n",(float)num1/num2);
        System.out.printf("Mul=%d\n",num1*num2);
    }
    
}
