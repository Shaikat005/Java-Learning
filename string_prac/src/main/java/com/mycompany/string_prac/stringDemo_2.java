
package com.mycompany.string_prac;
import java.util.*;
public class stringDemo_2 {
    public static void main(String[] args){
        String First_name="Hasan";
        String Last_name=" Nawab";
        //String Full_Name=First_name+Last_name;
        System.out.println(First_name.concat(Last_name).toUpperCase()+" Shaikat".toUpperCase());
        System.out.println(First_name.toUpperCase());
        boolean b=First_name.startsWith("Has");
        System.out.println(b);
    }
}
