package aditi;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        while (number%2==0){
            number = number/2;
        }
        if (number == 1){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not power of 2");
        }
    }
}
