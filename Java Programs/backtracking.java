package aditi;

import java.util.Scanner;

public class backtracking {
    public static void printpermutation(String str, String permutation, int index){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i =0; i<str.length(); i++) {
            char curr_char = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permutation+curr_char, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        printpermutation(str, "", 0);
    }
}

//Time Complexity = n * n!