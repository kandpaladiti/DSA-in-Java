package aditi;

import java.util.Scanner;

public class naturalnumbersum {
    public static void printsum(int i, int n, int sum){
        if (i > n){ // base condition
            System.out.println("Sum is = "+sum);
            return;
        }
        sum +=i;
        printsum(i+1, n, sum); //recursion
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printsum(1, n, 0); //function call
    }
}