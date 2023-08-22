package aditi;
import java.util.Scanner;

public class early_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 5) != 0 && (n % 3) !=0 && (n % 2) != 0){
            System.out.println(n + " is an early number.");
        }
        else {
            System.out.println(n+ " is not an early number.");
        }
    }
}