package aditi;

import java.util.Scanner;

public class waystoinviteguest {
    public static int callguest(int n){
        if (n <= 1){
            return 1;
        }
        //single
        int ways1 = callguest(n-1);

        //pair
        int ways2 = (n-1)*callguest(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of guest: ");
        int n = sc.nextInt();
        System.out.println(callguest(n));
    }
}