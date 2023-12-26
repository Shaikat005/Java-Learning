package com.mycompany.projrct1;

import java.util.Scanner;

public class String_input {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name=input.nextLine();
        System.out.print(name);
    }
}
