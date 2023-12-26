package practice;
import java.util.*;
public class Prac3 {
    
    public static void  L_reverse_tri(int n){
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
    public static void R_reverse_tri(int n){
        int i,j,k;
        for(i=n;i>=1;i--){
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            
            for(k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void pyramid(int n){
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the nomber of rows: ");
        int n=in.nextInt();
        L_reverse_tri(n);
        System.out.println("\n");
        pyramid(n);
        System.out.println("\n");
        R_reverse_tri(n);
    }
}
