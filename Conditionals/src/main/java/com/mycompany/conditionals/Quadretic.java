package com.mycompany.conditionals;
import java.util.*;
import static java.lang.Math.sqrt;
public class Quadretic {
    public static void main(String[] args){
		Scanner input=new Scanner(System.in); 
		double a,b,c,D,X1,X2,X;
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		D=b*b-(4.0*a*c);
		if(D==0)
		{
			X=-b/(2*a);
                        System.out.printf("X=%.2f",X);
		}
                else if(D>0)
                {
                    X1=(-b+sqrt(D))/(2*a);
                    X2=(-b-sqrt(D))/(2*a);
                    System.out.printf("X1=%.2f and X2=%.2f", X1,X2);
                }
                else if(D<0)
                {   
                    double real=-b/(2*a);
                    double img=(sqrt(-D))/(2*a);
                    X2=(-b-sqrt(D))/(2*a);
                    System.out.printf("X1=%.2f+%.2fi and X2=%.2f-%.2fi", real,img,real,img);
                }
                
	}
}
