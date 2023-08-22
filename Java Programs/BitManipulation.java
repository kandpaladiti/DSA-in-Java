package aditi;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        //GET BIT
        int n =5; //0101
        int position = 2;
        int bitmask = 1<<position;

        if ((bitmask & n) == 0){
            System.out.println("Bit was zero.");
        }
        else{
            System.out.println("Bit was one.");
        }

        //SET BIT
        int x =5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | x;
        System.out.println(newNumber);

        //CLEAR BIT
        int a = 5;
        int positions = 2;
        int BitMask = 1<<positions;
        BitMask = ~(BitMask);

        int NewNumber = BitMask & a;
        System.out.println(NewNumber);

        //UPDATE BIT
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation 1 or 0: ");
        int oper = sc.nextInt();
        //operation1 = set and operation0 = clear
        int b = 5;
        int Position = 1;

        //bitmask
        int Bit_Mask = 1 << Position;
        if (oper == 1) {
            //set
            int Newnumber = Bit_Mask | b;
            System.out.println(Newnumber);
        }
        else{
            //clear
            Bit_Mask = ~(Bit_Mask);
            int Newnumber = Bit_Mask & b;
            System.out.println(Newnumber);
        }
    }
}
