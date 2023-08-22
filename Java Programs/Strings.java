package aditi;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String Decleration
        String name = "Aditi";
        String fullname = "Aditi Kandpal";
        String sentence = "My name is Aditi Kandpal";

        //String Inpur
        Scanner sc = new Scanner(System.in);
        //String Name = sc.next();
        String FullName = sc.nextLine();
        //System.out.println("Your name is: "+ Name);
        System.out.println("Your full name is: "+ FullName);
    }
}
