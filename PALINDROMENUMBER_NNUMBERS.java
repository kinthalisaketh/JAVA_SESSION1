import java.util.Scanner;
public class PALINDROMENUMBER_NNUMBERS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = s.nextInt();
        System.out.println("Palindrome numbers up to " + N + " are:");
        for (int i = 1; i <= N; i++) {
            int originalNumber = i;
            int reversedNumber = 0;
            int temp = i;
            while (temp != 0) {
                int digit = temp % 10;
                reversedNumber = reversedNumber * 10 + digit;
                temp /= 10;
            }
            if (originalNumber == reversedNumber) {
                System.out.print(originalNumber + " ");
            }
        }
        s.close();
    }
}
