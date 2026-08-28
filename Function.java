import java.util.*;

class PracticeFunction {

    public static void calculateFibonacci(int n) {

        int a = 1;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 1; i <= n; i++) {

            int temp = a + b;

            System.out.print(" "+temp + " ");

            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the Fibonacci series:");
        int n = sc.nextInt();

        calculateFibonacci(n);
    }
}