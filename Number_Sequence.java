import java.util.Scanner;
public class Number_Sequence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE RANGE: ");
		int n=s.nextInt();
		for(int i=0; i<=n; i++) {
			System.out.println(i);
		}
		s.close();
	}

}
