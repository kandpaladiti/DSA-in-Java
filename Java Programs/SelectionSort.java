package aditi;

import java.util.Scanner;

public class SelectionSort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
//        int [] arr = {7, 8, 3, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        //array input
        System.out.print("Enter elements of the array: ");
        for (int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }

        //Time Complexity of Selection Sort is: O(n^2)

        //selection sort
        for (int i=0; i<arr.length -1; i++){
            int smallest = i;
            for (int j =i+1; j< arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
                //swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
        System.out.print("Sorted array is: ");
        printarray(arr); //function call
    }
}
