package practice;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=in.nextInt(); 
        int[] number=new int[n];
        int i,j;
        for( i=0;i<n;i++)
        {
            number[i]=in.nextInt();
        }
        System.out.println("Before sorting:");
        for(i=0;i<n;i++){
            System.out.println(number[i]);
        }
        
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(number[i]>number[j])
                {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        
        System.out.println("After sorting:");
        for(i=0;i<n;i++){
            System.out.println(number[i]);
        }
        
        char[] S={'e','b','A','d'};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(S));
        Arrays.sort(S);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(S));
    }
}
