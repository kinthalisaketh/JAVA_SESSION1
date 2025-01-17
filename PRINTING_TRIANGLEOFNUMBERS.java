import java.util.*;
public class PRINTING_TRIANGLEOFNUMBERS {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ROWS: ");
		int n= s.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
