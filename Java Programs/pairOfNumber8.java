package aditi;

public class pairOfNumber8 {
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 3, 7, 6};
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] + arr[j] == 8){
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}