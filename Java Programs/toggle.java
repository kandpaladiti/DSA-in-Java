package aditi;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        //bitmask
        int bitmask = 1<<pos;
        //XOR Operation
        int newnumber = bitmask ^ n;
        System.out.println("Number after being toggled: "+newnumber);
    }
}