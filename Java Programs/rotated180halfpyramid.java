package aditi;

import java.util.Scanner;

public class rotated180halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop --> for printing n
        for (int i=1; i<=n;i++){
            // inner loop --> space print
            for (int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            // inner loop --> stars
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// pyramid
/*package aditi;

        import java.util.Scanner;

public class rotated180halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop --> for printing n
        for (int i=1; i<=n;i++){
            // inner loop --> space print
            for (int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            // inner loop --> stars
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/