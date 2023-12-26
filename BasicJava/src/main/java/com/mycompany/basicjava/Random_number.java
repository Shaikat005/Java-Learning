//Random number generator:
package com.mycompany.basicjava;

import java.util.Random;

public class Random_number {
    public static void main(String[] args){
        Random rand=new Random();
        int randomNumber=rand.nextInt(10);/*It will generate random 
        number from 0 to 9*/
        System.out.println("Random number: "+randomNumber);
        
        int Randomnumber=rand.nextInt(91)+10;/*It will generate random number from
        10 to 100*/
        System.out.println("Random number= "+Randomnumber);
    }
}
