import java.util.*;
public class N_PRIMES_SUM_AVG {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    public static int sum(int[] primes) {
        int sum = 0;
        for (int prime : primes) {
            sum += prime;
        }
        return sum;
    }

    public static double average(int[] primes) {
        if (primes.length == 0) {
            return 0;
        }
        double sum = sum(primes);
        return sum / primes.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of primes to print: ");
        int n = s.nextInt();
        int[] primes = generatePrimes(n);
        System.out.println("First " + n + " prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
        int sum = sum(primes);
        double average = average(primes);
        System.out.println("Sum of the primes: " + sum);
        System.out.println("Average of the primes: " + average);
        s.close();
    }
}
