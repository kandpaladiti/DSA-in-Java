package aditi;

import java.util.Scanner;

public class evenornot {
    public static void iseven(int n){
        if(n<0){
            System.out.println(n+ " is a Negative Number");
        }
        if(n==1){
            System.out.println(n+ " is Neither even nor odd");
        }
        if(n%2==0){
            System.out.println(n+ " is a Even Number");
        }
        else{
            System.out.println(n+ " is a Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        iseven(n);
    }
}
