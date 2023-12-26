import java.util.*;
public class V_C{
	public static void main(String[] args){
		char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		if(ch>='A' && ch<='Z')
			ch=java. lang. Character. toLowerCase(ch) ;
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.print("It is vowel.");
		else
			System.out.print("It is consonant.");
	}
}