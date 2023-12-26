package com.mycompany.projrct1;

import java.util.Scanner;

public class Triangle_area {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float b,h;
        System.out.print("Enter base and height:\n");
        b=in.nextFloat();
        h=in.nextFloat();
        System.out.printf("The area is: %f",(0.5*b*h));
    }
}
