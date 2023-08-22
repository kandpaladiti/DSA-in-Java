package aditi;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String email = sc.next();
        String UserName = "";

        for (int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else {
                UserName = UserName + email.charAt(i);
            }
        }
        System.out.println("Username is: " + UserName);
    }
}