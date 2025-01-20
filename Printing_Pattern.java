import java.util.*;
public class Printing_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER OF ROWS TO BE PRINT: ");
		int n =sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++ ) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
