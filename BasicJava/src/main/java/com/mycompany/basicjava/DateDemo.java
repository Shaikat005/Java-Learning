package com.mycompany.basicjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        //printing current date and time:
        Date date=new Date();
        System.out.println(date);
        //creating date format:
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
        String currentDate=dateFormat.format(date);
        System.out.println("Current date: "+currentDate);   
    }
}
