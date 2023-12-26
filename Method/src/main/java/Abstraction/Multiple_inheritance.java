package Abstraction;
//Multiple inheritance using interface
interface Printable{  
void print();  
}  

interface Showable{  
void show();  
}  
public class Multiple_inheritance implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
Multiple_inheritance obj = new Multiple_inheritance();  
obj.print();  
obj.show();  
 }  
}  
