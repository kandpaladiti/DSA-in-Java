package aditi;

import java.util.Scanner;

public class stack_height {
    public static int power(int x, int n){
        if(n==0){ //base case: 1
            return 1;
        }
        if(x==0){ //base case: 2
            return 0;
        }
//        int pow = x * power(x,n-1);
//        return pow;
        int xpowernminus1 = power(x, n-1);
        int xpower = x * xpowernminus1;
        return xpower;
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
