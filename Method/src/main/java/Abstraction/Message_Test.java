//Demo of Abstract class
package Abstraction;
 abstract class  SendMessage {
    public abstract void Message();

}
 class Shaikat extends SendMessage{ 
    public void Message(){ 
    System.out.println("Hi,I'm Shaikat"); 
    } 
    } 
  abstract class Asif extends SendMessage { 
        public void Concrete_Message(){
             System.out.println("Hi, I'm Asif.");
          }
       }
public class Message_Test{
public static void main(String[] Args){
    Shaikat ob1=new Shaikat();
        
    Asif ob2=new Asif() {
      public void Message(){
          System.out.println("Hi, I'm asif from Abstract class.");
      }
    };
    ob1.Message();
    ob2.Concrete_Message();
    ob2.Message();
} 
}