package aditi;

import java.util.Scanner;

public class maxMinNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        //input
        System.out.println("Enter values in the array: ");
        for (int i=0;i<Size;i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i< numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Minimum Number is: "+min);
        System.out.println("Maximum Number is: "+max);
    }
}
