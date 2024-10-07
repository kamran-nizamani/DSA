package lab7;
import java.util.Scanner;

public class Fibonnci {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number: ");
int n = sc.nextInt();
long startTime=System.currentTimeMillis();
Itterative(n);
long endTime=System.currentTimeMillis();
System.out.println("Time taken by Iterative method: "+(endTime-startTime)+" ms");
startTime=System.currentTimeMillis();
Recursive(n);
endTime=System.currentTimeMillis();
System.out.println("Time taken by Resursive method: "+(endTime-startTime)+" ms");



    
}

public static void Itterative(int  n) {
int t1=0,t2=1;
System.out.print("Ittertive Fib Series\n");
for(int i=0;i<n+1;i++){
    System.out.print(t1+" ");
    int temp=t1+t2;
    t1=t2;
    t2=temp;
}
System.out.println();

         
    }
    public static void Recursive(int n) {
        System.out.println("Resursive approch :");
        for(int i=0;i<n+1;++i){
            System.out.print(fib(i)+" ");

        }
        System.out.println();
    }
        public static int  fib(int n){
            if(n<=1){
                return n;

            }
            else{
                return fib(n-1)+fib(n-2);
            }
        }
}

    

