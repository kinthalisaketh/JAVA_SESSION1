import java.util.*;
public class Floyds_Triangle {
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS TO BE PRINT: ");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int number =1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number +" ");
				number++;
			}
			System.out.println();
		}
		s.close();
	}

}
