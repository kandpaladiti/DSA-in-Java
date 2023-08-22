package aditi;

import java.util.Scanner;

public class fibonacciusingrecursion {
    public static void fibonacci(int a, int b, int n){
//    public static int Fibonacci(int n)
//    {
//        if (n <= 1)
//            return n;
//        return Fibonacci(n - 1) + Fibonacci(n - 2);
//    }
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);

    }
    public static void main(String[] args) {
        int a =0 , b =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series till "+n+" is: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibonacci(a, b, n-2);
        //System.out.println(n+"th fibonacci number is: "+Fibonacci(n-1));
    }
}
