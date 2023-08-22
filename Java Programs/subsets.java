package aditi;

import java.util.ArrayList;
import java.util.Scanner;

public class subsets {
    public static void printsubset(ArrayList<Integer> subset){
        for (int i = 0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if (n == 0){
            printsubset(subset);
            return;
        }
         //add
        subset.add(n);
        findSubset(n-1, subset);

        //not add
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}

//Time Complexity = O(2^n)