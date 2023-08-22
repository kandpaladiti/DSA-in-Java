package aditi;
import java.util.*;

public class Intersection_of_2_arrays {
    public static int intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j=0; j<arr2.length; j++){
            if (set.contains(arr2[j])){
                count++;
                arr.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        System.out.println("Common elements are: " + arr);
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println("Number of common elements: " + intersection(arr1, arr2));
    }
}