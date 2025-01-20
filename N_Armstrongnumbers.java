import java.util.*;
public class N_Armstrongnumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE VALUE: ");
		int n=s.nextInt();
		for(int i=0;i<=n;i++) {
			int sum =0;
			int k=i;
			while(k>0) {
				int d=k%10;
				sum+=(d*d*d);
				k/=10;
			}
			if(i==sum) {
				System.out.println( i );
			}
			
		}
		
		s.close();
	}

}
