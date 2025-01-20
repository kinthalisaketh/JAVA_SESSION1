import java.util.*;
public class Check_Palindrome {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		int number = s.nextInt();
		int originalnumber = number;
		int reversenumber = 0;
		while(number!=0) {
			int digit = number%10;
			reversenumber=reversenumber*10+digit;
			number/=10;
		}
		if(originalnumber==reversenumber) {
			System.out.println(originalnumber+" is a palindrome");
		}else {
			System.out.println(originalnumber+" is not a palindrome");
		}
		s.close();
	}
}
