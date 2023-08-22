package aditi;

import java.util.HashSet;
import java.util.Scanner;

public class unique_subsequence {
    public static void subsequences(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if (set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current_character = str.charAt(index);

        //to be
        subsequences(str, index+1, newString+current_character, set);

        //or not to be
        subsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}