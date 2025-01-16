import java.util.*;
public class ARMSTRONG_NUMBER {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		int sum=0;
		int n= s.nextInt();
		int k=n;
		while(k>0) {
			int d=k%10;
			sum+=(d*d*d);
			k/=10;
		}
		if(sum==n) {
		System.out.println(n + " is a" + " ARMSTRONG NUMBER");
		}
		else {
			System.out.println(n +" is not a "+ " ARMSTRONG NUMBER");
		}
		s.close();

	}

}
