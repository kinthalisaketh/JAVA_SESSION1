
import java.util.*;
public class SUM_DIGIT_NUMBER {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER THE VALUE: ");
		int sum=0;
		int n = s.nextInt();
		int k=n;
		while(k>0) {
			sum+=k%10;
			k/=10;
			}
			System.out.println("SUM OF "+ n + " DIGITS :" + sum);
			s.close();
	}

}
