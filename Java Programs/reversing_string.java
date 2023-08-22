package aditi;

import java.util.Scanner;

public class reversing_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String: ");
        StringBuilder str = new StringBuilder(sc.next());

        for (int i=0; i<str.length()/2;i++){
            int front = i;
            int back = str.length() -1 -i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println("Reverse_String is: "+str);
    }



    //another method

    //public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Original String: ");
//        String str = sc.next();
//        String reversestring = "";
//
//        for (int i= str.length()-1; i>=0;i--){
//            reversestring = reversestring + str.charAt(i);
//        }
//        System.out.println("Reverse String: "+reversestring);
//    }
}

