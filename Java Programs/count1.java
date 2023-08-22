package aditi;

import java.util.Scanner;

public class count1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n>0){
            if ((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Number of 1s: "+count);
    }
}