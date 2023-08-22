package aditi;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is lesser than b");*/
        int button = sc.nextInt();
        /*if(button == 1){
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }*/
        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}
