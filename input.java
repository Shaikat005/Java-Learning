import java.util.Scanner;
public class input{
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int num;
       System.out.printf("Enter a number: ");
       num=input.nextInt();
       System.out.printf("Number=%d\n",num);
       
       /*String name="Anisul Islam";
       System.out.println("Name= "+name);*/
       
       String name;
       name=input.nextLine();
       System.out.println("Name= "+name);
       
    }
}