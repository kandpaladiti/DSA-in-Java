package aditi;

import java.util.Scanner;

public class sorted_strictly_increasing {
    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
//        if (arr[index] < arr[index+1]){
//            //array is sorted till now
//            return isSorted(arr, index+1);
//        }
//        else{
//            return false;
        if (arr[index] >= arr[index+1]){
            //array is unsorted
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input
        System.out.print("Enter array elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}

//Time complexity = O(n), where n = length of array.