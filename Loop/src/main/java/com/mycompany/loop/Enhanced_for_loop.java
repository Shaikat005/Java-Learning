package com.mycompany.loop;
//printing array and string using enhanced for loop:
public class Enhanced_for_loop {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        String[] name=new String[3];
        name[0]="Shaikat";
        name[1]="Rakib";
        name[2]="Shibli";
        for(int x: a)
            System.out.print(x+" ");
        System.out.print("\n");
        for(String x: name)
            System.out.println(x);
    }
}
