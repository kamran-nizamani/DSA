package lab7;
import java.util.Scanner;

public class Factorial {

    public static long Iterative(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " using Iterative approach: " + fact);
        return fact;
    }

    public static long Recursive(long n) {
        if (n == 0|| n==1) {
            return 1L;
        } else {
            return n * Recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        long startTime = System.currentTimeMillis();
        Iterative(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Iterative method: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
      long r=   Recursive(n);
        endTime = System.currentTimeMillis();
        System.out.println("Factorial of " + n + " using Recursive approach: "+r);
        System.out.println("Time taken by Recursive method: " + (endTime - startTime) + " ms");

        
    }
}
