package aditi;

import java.util.Scanner;

public class circumferenceofcircle {
    public static double circumference(double r){
         double cir = 2 * (3.14) * r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Circumference of the circle having radius "+r+" is "+circumference(r));
    }
}
