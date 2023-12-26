//conversion from Decimal to Binaery,octal,hexadecimal:
package com.mycompany.string_prac;
public class NumberConversion1 {
    public static void main(String[] args){
        int Decimal=10;
        String binary=Integer.toBinaryString(Decimal);
        System.out.println("Binary Value="+binary);
        
        String octal=Integer.toOctalString(Decimal);
        System.out.println("Octal value="+octal);
        
        String Hexa=Integer.toHexString(Decimal);
        System.out.println("Headecimal value="+Hexa);
    }
}
