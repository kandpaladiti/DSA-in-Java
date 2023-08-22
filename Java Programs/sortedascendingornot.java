package aditi;

import java.util.Scanner;

public class sortedascendingornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        //input
        System.out.println("Enter values in the array: ");
        for (int i=0;i<Size;i++){
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = false;

        for (int i=0;i< numbers.length-1;i++){
            if (numbers[i]<numbers[i+1]){
                isAscending = true;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        }
        else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
