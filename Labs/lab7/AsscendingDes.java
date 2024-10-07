package lab7;
import java.util.Scanner;
public class AsscendingDes{
    public static void printAscending(int n) {
        if (n == 0) return;
        printAscending(n - 1);
        System.out.print(n + " ");
    }
    public static void printDessendin(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        printDessendin(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

         
        System.out.println("Assending Order " );
        printAscending(n);
        System.out.println("\nDesending Order ");
        printDessendin(n);
    }
}
