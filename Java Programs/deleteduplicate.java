package aditi;

import java.util.Scanner;

public class deleteduplicate {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char current_character = str.charAt(index);
        if (map[current_character - 'a'] == true){
            removeDuplicates(str, index+1, newString);
        }
        else {
            newString += current_character;
            map[current_character - 'a'] = true;
            removeDuplicates(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        removeDuplicates(str, 0, "");
    }
}

//Time Complexity = O(n)