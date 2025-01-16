import java.util.Scanner;
public class SUM_ODD {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("ENTER THE UPPER LIMIT: ");
		int n = scanner.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("The sum of odd numbers upto "+ n +"  is "+sum);
		scanner.close();
	}
}
