package aditi;

import java.util.Scanner;

public class keypadpattern {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str, int index, String combination){
        if (index == str.length()){
            System.out.println(combination);
            return;
        }
        char current_character = str.charAt(index);
        String Mapping = keypad[current_character - '0'];

        for (int i = 0; i<Mapping.length(); i++){
            printComb(str, index+1, combination+Mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        printComb(str, 0, "");
    }
}

//Time Complexity = 4^n 