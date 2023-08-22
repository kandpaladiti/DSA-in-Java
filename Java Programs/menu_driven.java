package aditi;

import java.util.Scanner;

public class menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            switch(n) {
                case 1 :
                    int marks = sc.nextInt();
                    if (marks >= 90){
                        System.out.println("This is Good");
                    } else if (marks>=60 && marks<=89) {
                        System.out.println("This is also Good");
                    } else if (marks>=0 && marks<=59) {
                        System.out.println("This is Good as well");
                    }
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("Invalid Input");
            }
        } while (n!= 0);
    }
}
