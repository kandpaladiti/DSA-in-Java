package aditi;

import java.util.Scanner;

public class printnumberbyRecursion2 {
    public static void main(String[] args) {
        //Recursion means a function calls itself.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if (n==6){    //Base case
            return;
        }
        System.out.print(n+" "); //print
        printNumbers(n+1);  //recursion
    }
}
