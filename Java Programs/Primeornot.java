package aditi;

import java.util.Scanner;

public class Primeornot {
    public static boolean isPrime(int n){
       if(n<=1){
           return false;
       }
       for (int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is a Prime Number.");
        } else {
            System.out.println(n +" is not a Prime Number");
        }
        /*int flag = 0;
        for (int i=1; i<=n;i++){
            if (n%i==0){
                flag++;
            }
        }
        if (flag ==2){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }*/
    }
}
