package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Practrice {
    public static void main(String[] args) {
          try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1=scanner.nextInt();
            System.out.println("Enter num2: ");
            int num2=scanner.nextInt();
            int result=num1/num2;
            System.out.println("Result= "+result);
          }catch(InputMismatchException e){
              System.out.println("Exception: "+e);
              System.out.println("You must enter integer.Please try again.");
          }catch(ArithmeticException e1){
              System.out.println("Exception: "+e1);
              System.out.println("You must enter integer.Please try again.");
          }
    }

    
}
