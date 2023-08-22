package aditi;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void tower_of_hanoi(int n, String source, String helper, String destination){
        if (n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        tower_of_hanoi(n-1, source, destination, helper );
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        tower_of_hanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disk to be transferred: ");
        int n = sc.nextInt();
        tower_of_hanoi(n, "S", "H", "D");
    }
}


/*Time Complexity of Tower Of Hanoi is O(2^n -1) = O(2^n)
T(n) = 2T(n-1) + 1
T(n-1) = 2T(n-2) +1
T(n-2) = 2T(n-3) +1
.
.
.
T(n) = 2T(n-1)+1 = 2(2T(n-2)+1)+1 = 4T(n-2)+2+1 = 4(2T(n-3)+1)+2+1 = 8T(n-3)+4+2+1
we have to do this until we get the value of T(n-x) = 1 or n-1 = x
2^(n-1) T(1) + 2^(n-2)+2^(n-3)+.. = 2^n (ignoring -1)
 */