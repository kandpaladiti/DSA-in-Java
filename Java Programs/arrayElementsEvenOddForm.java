package aditi;

public class arrayElementsEvenOddForm {
    public static void arrangeEvenOdd(int[] arr) {
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // Swap the current even element with the element at oddIndex
                int temp = arr[i];
                arr[i] = arr[oddIndex];
                arr[oddIndex] = temp;

                oddIndex += 2;
            }
        }
        for (int k= 0;k< arr.length;k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {3, 2, 1, 8};
        arrangeEvenOdd(array);
    }
}
