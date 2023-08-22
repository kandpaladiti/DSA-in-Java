package aditi;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        long Binary_Number = decimalToBinary(decimalNumber);
        System.out.println("Binary representation of "+decimalNumber+" is: "+Binary_Number);
        System.out.print("Enter a binary number: ");
        long binaryNumber = sc.nextLong();
        int Decimal_Number = binaryToDecimal(binaryNumber);
        System.out.println("Decimal representation of "+binaryNumber+" is: "+Decimal_Number);
    }
        public static long decimalToBinary(int decimalNumber){
          long binary = 0;
          long placeValue = 1;

           while(decimalNumber > 0){
              binary += (decimalNumber%2) * placeValue;
              decimalNumber /= 2;
              placeValue *=10;
          }
          return binary;
      }

      public static int binaryToDecimal(long binaryNumber){
        int decimal = 0;
        int power = 0;

        while (binaryNumber > 0){
            int digit = (int) (binaryNumber%10);
            decimal += digit * (int) Math.pow(2, power);
            binaryNumber /= 10;
            power++;
        }
        return decimal;
      }
}
