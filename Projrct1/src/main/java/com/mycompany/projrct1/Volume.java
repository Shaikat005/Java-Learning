//Volume of a cube:
import java.utill.Scanner;
public class Volume{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int L,volume;
		System.out.print("Enter the length:\n");
		L=input.nextInt();
		Volume=L*L*L;
		System.out.printf("The volume is %d cubic unit.",Volume);
	}
}