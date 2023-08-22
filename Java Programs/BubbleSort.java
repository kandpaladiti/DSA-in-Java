package aditi;

import java.util.Scanner;

public class BubbleSort {
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

        //bubble sort
        for (int i=0; i<arr.length -1; i++){
            for (int j =0; j< arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        printarray(arr); //function call
    }
}
