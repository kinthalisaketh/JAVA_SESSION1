import java.util.*;
public class Sum_Numbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SUM OF FIRST N NUMBERS: ");
		int sum=0;
		int i;
		int n = sc.nextInt();
		for(i=0; i<n; i++) {
			sum+=i;
		}
			System.out.println("SUM OF "+ n + " NUMBERS IS " + sum);
			sc.close();
		}	
}

