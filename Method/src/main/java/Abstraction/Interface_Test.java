package Abstraction;
interface A{  
void Display();  
}  
  
class B implements A{  
public void Display(){System.out.println("I am B");}  
}  
  
class C implements A{  
public void Display(){System.out.println("I am C");}
}  
  
public class Interface_Test{  
public static void main(String args[]){  
B ob1=new B();
ob1.Display();

C ob2=new C();
ob2.Display();

}
}
  

