package aditi;

import java.util.Scanner;

public class allXatlast {
    public static void movaAllX(String s, int index, int count,String newString){
        if (index==s.length()){
            for (int i=0; i< count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current_character = s.charAt(index);
        if (current_character == 'x'){
            count++;
            movaAllX(s, index+1, count, newString);
        }
        else {
            newString += current_character;
            movaAllX(s, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.print("New String is: ");
        movaAllX(s, 0, 0, " ");
    }
}

//Time complexity = O(n), where n = length of string.