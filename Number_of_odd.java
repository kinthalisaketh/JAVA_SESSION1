import java.util.*;
public class Number_of_odd {
	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("ENTER THE VALUE: ");
			int n= s.nextInt();
			int i;
			int count=0;
			for(i=1; i<=n; i++) {
				if(i%2!=0) {
					count++;
			}
		}
		System.out.println("NUMBER OF ODD NUMBERS BETWEEN "+ n +" is " + count);
		s.close();
	}
}
