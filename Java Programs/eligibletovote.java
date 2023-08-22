package aditi;
import java.util.Scanner;

public class eligibletovote {
    public static boolean age(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age(age)){
            System.out.println("Person is eligible to vote.");
        }
        else{
            System.out.println("Person is not eligible to vote.");
        }
    }
}