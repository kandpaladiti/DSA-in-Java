package aditi;

import java.util.Scanner;

public class arrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String[] array = new String[size];
        int totalLength = 0;

        System.out.println("Enter array elements: ");
        for (int i=0;i<size;i++){
            array[i] = sc.next();
            totalLength = totalLength + array[i].length();
        }
        System.out.println("Total Length of array is: "+totalLength);
    }
}
