package aditi;

import java.util.Scanner;

public class factorialusingrecursion {
    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fact_n_minus_1 = factorial(n-1);
        int fact_n = n * fact_n_minus_1;
        return fact_n;

        //another method

//        int fact = n * factorial(n-1);
//        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" is: "+factorial(n));
    }
}