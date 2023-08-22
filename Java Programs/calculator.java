package aditi;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        int result;

        switch (operator){
            case '+' :
                result = a + b;
                System.out.println(result);
                break;
            case '-' :
                result = a - b;
                System.out.println(result);
                break;
            case '*' :
                result = a * b;
                System.out.println(result);
                break;
            case '/' : if(b==0){
                System.out.println("Invalid Divisior");
            }else {result = a / b;
                System.out.println(result);}
                break;
            case '%' : if(b==0){
                System.out.println("Invalid Divisior");
            }else {result = a % b;
                System.out.println(result);}
                break;
            default :
                System.out.println("Invalid Operator");
        }
    }
}
