package aditi;

import java.util.Scanner;

public class power {
    public static double power(double x, double n){
        double pow = Math.pow(x,n);
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        double n = sc.nextDouble();
        System.out.println(x+ " to the power "+n+ " is : "+power(x,n));
    }
}