package aditi;

public class rotate_an_array {
    public static void rightRotation(int arr[]){
        int temp=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j=i-1; j<i; j++) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for (int k= 0;k< arr.length;k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void leftRotation(int arr[]){
        int temp =0;
        for (int i=arr.length-1; i>0; i--){
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
        }
        for (int k= 0;k< arr.length;k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 8};
        leftRotation(arr);
        leftRotation(arr);
        rightRotation(arr);
    }
}