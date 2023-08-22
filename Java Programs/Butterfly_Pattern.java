package aditi;

import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half
        for (int i=1;i<=n;i++) {
            // first part stars
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // second part stars
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower half
        for (int i=n;i>=1;i--) {
            // first part stars
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // second part stars
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
