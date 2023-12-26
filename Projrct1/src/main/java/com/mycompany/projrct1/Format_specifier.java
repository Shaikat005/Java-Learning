package com.mycompany.projrct1;
public class Format_specifier {
    public static void main(String[] args){
        boolean b=true;
        int i=10;
        double d=10.222145;
        float f=10.223564f;
        char c='a';
        short s=3267;
        //If we use format specifier then we must use "printf" to print something.
        System.out.printf("b=%b\n",b);
        System.out.printf("i=%d\n",i);
        System.out.printf("d=%.2f\n",d);
        System.out.printf("f=%.2f\n",f);
        System.out.printf("c=%c\n",c);
        System.out.printf("s=%s\n",s);
    }
}
