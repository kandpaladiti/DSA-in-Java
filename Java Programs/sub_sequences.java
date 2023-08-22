package aditi;

import java.util.Scanner;

public class sub_sequences {
    public static void subsequences(String str, int index, String newString){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char current_character = str.charAt(index);

        //to be
        subsequences(str, index+1, newString+current_character);

        //or not to be
        subsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        subsequences(str, 0, "");
    }
}

//Time Complexity = O(2^n)