package com.mycompany.projrct1;

import java.util.Scanner;

public class Assignment1 
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int id,price;
        String title;
        String cat;
        System.out.println("Enter id:");
        id=input.nextInt();
        System.out.println("Enter Title:");
        input.nextLine();
        title=input.nextLine();
        System.out.println("Enter price:");
        price=input.nextInt();
        System.out.println("Enter category:");
        input.nextLine();
        cat=input.nextLine();
        System.out.println("ID- "+id);
        System.out.println("Title- "+title);
        System.out.println("Price- "+price);
        System.out.println("Category- "+cat);
    }
}
