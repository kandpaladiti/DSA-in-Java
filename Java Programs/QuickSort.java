package aditi;

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return  i; //pivot index
    }
    public static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }
    public static void main(String[] args) {
        int arr [] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        //print
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


/*Time Complexity of Quick Sort:

Worst Case: O(n^2)  [Worst Case occur when pivot is always the smallest or the largest element & this case will occur when the array is already sorted either in ascending or in descending order.]
This is because in each level we will run a loop and in 1st level loop runs n times, in 2nd level loop runs n-1 times and so on decreases by 1, and we will go till we not get 1. Now sum of time consumed in all these levels will be as: n+(n-1)+(n-2)+....+1 = (n*(n-1))/2 = n^2

Average Case: O(nlogn)
 */