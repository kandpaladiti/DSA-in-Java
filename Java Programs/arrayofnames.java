package aditi;

import java.util.Scanner;

public class arrayofnames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        System.out.println("Enter names: ");
        for (int i=0;i< names.length;i++){
            names[i] = sc.next();
        }

        //output
        for (int i=0;i< names.length;i++){
            System.out.println("name "+(i+1)+" is "+names[i]);
        }
    }
}
