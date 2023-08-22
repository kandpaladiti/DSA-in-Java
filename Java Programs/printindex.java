package aditi;

import java.util.Scanner;

public class printindex {
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
        System.out.println("Enter the value of x to be found in the array: ");
        int x = sc.nextInt();
        //Indicating variable if value not found
        boolean found = false;

        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == x){
                System.out.println(x+ " found at index "+i+"."); //output
                found = true;
            }
        }
        if (!found){
            System.out.println(x+" is not found in the given array."); //output
        }
    }
}
