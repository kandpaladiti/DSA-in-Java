package aditi;

import java.util.Scanner;

public class tableofnumber {
    public static int tables(int n){
        for (int i=1; i<=10;i++){
            System.out.println(n+" * "+i+ " = " + n*i);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tables(n);
    }
}
