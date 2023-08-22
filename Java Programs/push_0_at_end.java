package aditi;

public class push_0_at_end {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = {1, -1, 2, 0, -5, 0, 1, 8};
//        int array[] = new int[8];
//        int j=0;
//        for (int i=0; i<arr.length; i++){
//            if (arr[i] != 0){
//                array[j] = arr[i];
//                j++;
//            }
//            count++;
//        }
//        for (int i= 0;i< arr.length;i++){
//            System.out.print(array[i] + " ");
//        }

        for (int i=1; i< arr.length; i++){
            for (int j=0; j< i; j++){
                if (arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i= 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}