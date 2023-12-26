
package com.mycompany.string_prac;
import java.util.*;
public class DuplicateCharacters {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String string1;  
        int count,i;
        string1=in.next();
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
        //Counts each character present in the string
        for(i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.printf("%c arrived %d times.\n",string[i],count);  
        }  
    } 
}
