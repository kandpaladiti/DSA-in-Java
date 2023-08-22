package aditi;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumberCount=0, negativeNumberCount=0, zeroNumberCount = 0;
        /*char ans;
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n==0){
                zeroNumberCount++;
            } else if (n>0) {
                positiveNumberCount++;
            }
            else{
                negativeNumberCount++;
            }
            System.out.println("Do you want to continue y/n? ");
            ans = sc.next().charAt(0);
        } while (ans=='y'||ans=='Y');
        System.out.println("Positive Number: " + positiveNumberCount);
        System.out.println("Negative Number: " + negativeNumberCount);
        System.out.println("Zero Number: " + zeroNumberCount);*/

        int[] arr = new int[100];
        System.out.println("Enter numbers: ");
        for (int i=0;i<10;i++)
            arr[i]= sc.nextInt();
        for (int i=0;i<10;i++){
            if (arr[i] ==0){
                zeroNumberCount++;
            } else if (arr[i] >0) {
                positiveNumberCount++;
            }
            else{
                negativeNumberCount++;
            }
        }
        System.out.println("Positive Number: " + positiveNumberCount);
        System.out.println("Negative Number: " + negativeNumberCount);
        System.out.println("Zero Number: " + zeroNumberCount);
    }
}
