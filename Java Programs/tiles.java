package aditi;

import java.util.Scanner;

public class tiles {
    public static int placeTiles(int n, int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
        //vertically
        int verticalPlacemants = placeTiles(n-m, m);

        //horizontally
        int horizontalPlacements = placeTiles(n-1, m);

        return verticalPlacemants + horizontalPlacements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.println(placeTiles(n, m));
    }
}