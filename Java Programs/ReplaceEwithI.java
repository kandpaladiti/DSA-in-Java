package aditi;

import java.util.Scanner;

public class ReplaceEwithI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        String result = "";

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result = result + 'i';
            }
            else{
                result = result + str.charAt(i);
            }
        }
        System.out.println("Original String: "+str);
        System.out.println("Result String: "+result);
    }
}
