package aditi;
import java.util.*;

public class Union_of_2_arrays {
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        System.out.println("Elements of set are: " + set);
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println("Size of array is: " + union(arr1, arr2));
    }
}

//Time Complexity - O(n)