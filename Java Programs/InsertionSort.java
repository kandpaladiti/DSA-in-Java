package aditi;

import java.util.Scanner;

public class InsertionSort {
        public static void printarray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String[] args) {
        //int [] arr = {7, 8, 3, 1, 2};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            int [] arr = new int[size];

            //array input
            System.out.print("Enter elements of the array: ");
            for (int i=0;i< size;i++){
                arr[i] = sc.nextInt();
            }

            //Time Complexity of Insertion Sort is: O(n^2)

            //insertion sort
            for (int i=1; i<arr.length; i++){
                int current = arr[i];
                int j = i-1;
                while (j>=0 && current < arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
            System.out.print("Sorted array is: ");
            printarray(arr); //function call
        }

}
