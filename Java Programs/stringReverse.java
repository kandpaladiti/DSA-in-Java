package aditi;

import java.security.PublicKey;
import java.util.Scanner;

public class stringReverse {
    public static void Reverse_String(String s, int index){
        if (index == 0){
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        Reverse_String(s, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.print("Reverse String is: ");
        Reverse_String(s, s.length()-1);
    }
}

//Time complexity = O(n), where n = length of string.