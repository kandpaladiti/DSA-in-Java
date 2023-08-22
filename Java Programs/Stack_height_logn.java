package aditi;

import java.util.Scanner;

public class Stack_height_logn {
    //Print x^n (stack height = logn)
    public static int power(int x, int n){
        if(n==0){ //base case: 1
            return 1;
        }
        if(x==0){ //base case: 2
            return 0;
        }
        //if n is even
        if(n%2==0){
            return power(x, n/2) * power(x, n/2);
        }
        //if n is odd
        else {
            return power(x, n/2) * power(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" is: "+power(x, n));
    }
}
