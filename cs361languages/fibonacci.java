import java.util.Scanner;

public class fibonacci {
    public static int fib(int n) { 
        if (n < 0 || n > 45) {
            throw new IllegalArgumentException("n should be >= 0 and < 46");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        else { //n > 1
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What int do you want to Fibonacci (0 - 45)? ");
        int i = scan.nextInt();
        System.out.println("Fibonacci(" + i + ") = " + fib(i));
        scan.close();
    }
}
