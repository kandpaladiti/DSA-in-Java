package aditi;

import java.util.Scanner;

public class FirstandLastOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void printOccurance(String s, int index, char element){
        if (index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current_character = s.charAt(index);
        if (element == current_character){
            if(first == -1){
                first = index;
            }
            else {
                last = index;
            }
        }
        printOccurance(s, index+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        printOccurance(s, 0, 'a');
    }
}


//Time complexity = O(n), where n = length of string.