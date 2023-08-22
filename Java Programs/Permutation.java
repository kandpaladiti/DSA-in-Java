package aditi;

import java.util.Scanner;

public class Permutation {
    public static void printpermutations(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char current_character = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printpermutations(newStr, permutation+current_character);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        printpermutations(str, "");
    }
}
//Time Complexity = O(n!)