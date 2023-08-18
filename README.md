# DSA-in-Java

## Date : 6 July 2023

### **Today's Progress**

**_Ques 1: Enter 3 numbers from the user & make a function to print their average._**

```
package aditi;

import java.util.Scanner;
public class average {
    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of "+a+", "+b+" and "+c+" is "+average(a,b,c));
    }
}
```

**_Ques 2: Write a function to print the sum of all odd numbers from 1 to n._**

```
package aditi;

import java.util.Scanner;

public class sumofoddnumbers {
    public static int sumOfOddNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
                sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of all odd numbers till "+n+" is "+sumOfOddNumbers(n));
    }
}
```

**_Ques 3: Write a function which takes in 2 numbers and returns the greater of those two._**

```
package aditi;

import java.util.Scanner;

public class greatestoftwonumbers {
    public static void greaterNumber(int a,int b){
        if(a==b){
            System.out.println(a+" is equal to "+b);
        }
        else if (a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNumber(a,b);
    }
}
```

**_Ques 4: Write a function that takes in the radius as input and returns the circumference of a circle._**

```
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
```

**_Ques 5: Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote._**

```
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
```

**_Ques 6: Write an infinite loop using do while condition._**

```
package aditi;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            System.out.println("Hey! How are you?");
        } while (n>=0);
    }
}
```

**_Ques 7: Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered._**

```
package aditi;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumberCount=0, negativeNumberCount=0, zeroNumberCount = 0;
        /*char ans;
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n==0){
                zeroNumberCount++;
            } else if (n>0) {
                positiveNumberCount++;
            }
            else{
                negativeNumberCount++;
            }
            System.out.println("Do you want to continue y/n? ");
            ans = sc.next().charAt(0);
        } while (ans=='y'||ans=='Y');
        System.out.println("Positive Number: " + positiveNumberCount);
        System.out.println("Negative Number: " + negativeNumberCount);
        System.out.println("Zero Number: " + zeroNumberCount);*/
        int[] arr = new int[100];
        System.out.println("Enter numbers: ");
        for (int i=0;i<10;i++)
            arr[i]= sc.nextInt();
        for (int i=0;i<10;i++){
            if (arr[i] ==0){
                zeroNumberCount++;
            } else if (arr[i] >0) {
                positiveNumberCount++;
            }
            else{
                negativeNumberCount++;
            }
        }
        System.out.println("Positive Number: " + positiveNumberCount);
        System.out.println("Negative Number: " + negativeNumberCount);
        System.out.println("Zero Number: " + zeroNumberCount);
    }
}
```

## Date : 7 July 2023

### **Today's Progress**

**_Ques 1: Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn._**

```
package aditi;

import java.util.Scanner;

public class power {
    public static double power(double x, double n){
        double pow = Math.pow(x,n);
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        double n = sc.nextDouble();
        System.out.println(x+ " to the power "+n+ " is : "+power(x,n));
    }
}
```

**_Ques 2: Write a function that calculates the Greatest Common Divisor of 2 numbers._**

```
package aditi;

import java.util.Scanner;

public class GCD {
    public static int gcdof2numbers(int a, int b){
        int gcd = 1;
        for (int i=1; i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+ gcdof2numbers(a,b));
    }
}
```

##### _Other method of doing the above question_

```
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    }
```

**_Ques 3: Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it._**

```
package aditi;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int f=0;
        int s=1;
        System.out.print(f+" ");
        System.out.print(s+" ");
        for (int i =3; i<=n;i++){
            int t= f+s;
            f=s;
            s=t;
            System.out.print(t+" ");
        }
    }
}
```

## Date : 8 July 2023

### **Today's Progress**

**_Arrays Basics_**

```
package aditi;

public class Arrays {
    public static void main(String[] args) {
        // Both are valid syntax
        //int[] marks = new int[3];
        //int marks[] = new int[3];
        int marks[] = {97,98,95};
        /* marks[0] = 97; // phy
        marks[1] = 98; // chem
        marks[2] = 95; // eng*/
        // System.out.println(marks); // This will print a garbage value
        /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        // by loop
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
```

**_Some more about arrays_**

```
package aditi;

import java.util.Scanner;

public class moreaboutarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for (int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        //output

        for (int i=0;i<size;i++){
            System.out.print(number[i] + " ");
        }
    }
}
```

**_Ques 1: Take an array as input from the user. Search for a given number x and print the index at which it occurs._**

```
package aditi;

import java.util.Scanner;

public class printindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        //input
        System.out.println("Enter values in the array: ");
        for (int i=0;i<Size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x to be found in the array: ");
        int x = sc.nextInt();
        
        //Indicating variable if value not found
        boolean found = false;
        
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == x){
                System.out.println(x+ " found at index "+i+"."); //output
                found = true;
            }
        }
        if (!found){
            System.out.println(x+" is not found in the given array."); //output
        }
    }
}
```

**_Ques 2:Take an array of names as input from the user and print them on the screen._**

```
package aditi;

import java.util.Scanner;

public class arrayofnames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        System.out.println("Enter names: ");
        for (int i=0;i< names.length;i++){
            names[i] = sc.next();
        }

        //output
        for (int i=0;i< names.length;i++){
            System.out.println("name "+(i+1)+" is "+names[i]);
        }
    }
}
```

**_Ques 3: Find the maximum & minimum number in an array of integers._**

```
package aditi;

import java.util.Scanner;

public class maxMinNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        //input
        System.out.println("Enter values in the array: ");
        for (int i=0;i<Size;i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i< numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Minimum Number is: "+min);
        System.out.println("Maximum Number is: "+max);
    }
}
```

**_Ques 4: Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order._**

```
package aditi;

import java.util.Scanner;

public class sortedascendingornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];
        
        //input
        System.out.println("Enter values in the array: ");
        for (int i=0;i<Size;i++){
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = false;
        
        for (int i=0;i< numbers.length-1;i++){
            if (numbers[i]<numbers[i+1]){
                isAscending = true;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        }
        else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
```

## Date : 9 July 2023

### **Today's Progress**

**_Ques 1: 2D Arrays Basics_**

```
package aditi;
import java.util.Scanner;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //input
        //rows
        System.out.println("Enter elements of 2D Array: ");
        for (int i=0;i<rows;i++){
            //columns
            for (int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("2D Array is: ");
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**_Ques 2: Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs._**

```
package aditi;

import java.util.Scanner;

public class searchForX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

         int [][] matrix = new int[rows][cols];

         //input
        //rows
        System.out.println("Enter elements of Matrix: ");
        for (int i=0;i<rows;i++){
            //columns
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to be searched in the matrix: ");
        int x = sc.nextInt();

        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                //compare
                if (matrix[i][j] == x){
                    System.out.print(x+ " found at the location ("+i+ ","+j+") in the matrix.");
                }
            }
        }
    }
}
```

## Date : 10 July 2023

### **Today's Progress**

**_Ques 1: For a given matrix of N x M, print its transpose._**

```
package aditi;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];

        //input
        //rows
        System.out.println("Enter elements of Matrix: ");
        for (int i=0;i<rows;i++){
            //columns
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //transpose
        System.out.println("Transpose of the given matrix is: ");
        for (int j=0; j<cols;j++){
            for (int i=0;i<rows;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
```

**_Ques 2: Print the spital order matrix as output for the given matrix of numbers._**

```
package aditi;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];

        //input
        //rows
        System.out.println("Enter elements of Matrix: ");
        for (int i=0;i<rows;i++){
            //columns
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
         //Printing spiral order matrix
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        System.out.println("Spiral Order Matrix is: ");
        while(rowStart<=rowEnd && colStart<=colEnd){
            //1
            for (int col=colStart; col<=colEnd; col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;
            //2
            for (int row=rowStart; row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;
            //3
            for (int col=colEnd; col>=colStart; col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;
            //4
            for (int row=rowEnd; row>=rowStart;row--){
                System.out.print(matrix[row][colStart]+" ");
            }
            colStart++;

            //System.out.println();
        }
    }
}
```

**_String Basics_**

```
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
```

**_Functions on Strings_**

```
package aditi;

public class FunctionsOnString {
    public static void main(String[] args) {
        //concatenation
        String firstName = "Aditi";
        String lastName = "Kandpal";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);

        //to print string length
        System.out.println(fullName.length());

        //CharAt - print single character
        for (int i=0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }
        //comparing two strings (use of CompareTo() function)
        String name1 = "Aditi";
        String name2 = "Aditi";

        //case 1: s1>s2 - +ve value
        //case 2: s1==s2 - 0
        //case 3: s1<s2 - -ve value

        //if hello and cello will be compared then hello will be greater because h comes after c and have bigger value the c. Similarly, if hello and wello is compared then wello is greater than hello.

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

//        if (name1 == name2) {
//            System.out.println("Strings are equal.");
//        } else {
//            System.out.println("Strings are not equal.");
//        }

        //here == fails that's why use compareTo function

//        if(new String("aditi") == new String("aditi")){
//                System.out.println("Strings are equal.");
//        }
//        else {
//            System.out.println("Strings are not equal.");
//        }

        //Substring
        String sentence = "My name is Tony Stark";
        String name = sentence.substring(11, sentence.length()); //String name = sentence.substring(11);
        String names = sentence.substring(11,15);
        System.out.println(name);
        System.out.println(names);

        //Strings are immutable

        //ParseInt Method
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //ToString Method
        int numbers = 123;
        String Str = Integer.toString(numbers);
        System.out.println(Str);
        System.out.println(Str.length());
    }
}
```

**_Ques 3: Take an array of Strings input from the user & find the cumulative (combined) length of all those strings._**

```
package aditi;

import java.util.Scanner;

public class arrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String[] array = new String[size];
        int totalLength = 0;

        System.out.println("Enter array elements: ");
        for (int i=0;i<size;i++){
            array[i] = sc.next();
            totalLength = totalLength + array[i].length();
        }
        System.out.println("Total Length of array is: "+totalLength);
    }
}
```

## Date : 11 July 2023

### **Today's Progress**

**_Ques 1: Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”_**

```
package aditi;

import java.util.Scanner;

public class ReplaceEwithI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        String result = "";

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result = result + 'i';
            }
            else{
                result = result + str.charAt(i);
            }
        }
        System.out.println("Original String: "+str);
        System.out.println("Result String: "+result);
    }
}
```

**_Ques 2: Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”_**

```
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
```

**_String Builder and some basic operations of String Builder_**

```
package aditi;

public class String_Builder {
    public static void main(String[] args) {
        //StringBuilder Declaration
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'w');
        System.out.println(sb);

        //insert character
        sb.insert(0, 'p');
        System.out.println(sb);

        //delete a character
        sb.delete(3, 4);
        System.out.println(sb);

        //delete substring
        sb.delete(2,4);
        System.out.println(sb);

        //append - adding from last
        sb.append("l");
        sb.append("f");
        System.out.println(sb);

        //length of string
        System.out.println(sb.length());
    }
}
```

**_Ques 3: Reversing a String._**

```
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
}
```

##### _Another Method_

```
public class reversing_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String: ");
        String str = sc.next();
        String reversestring = "";

        for (int i= str.length()-1; i>=0;i--){
        reversestring = reversestring + str.charAt(i);
        }
        System.out.println("Reverse String: "+reversestring);
    }
}
```

**_Bit Manipulation Operation_**

```
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
```

## Date : 12 July 2023

### **Today's Progress**

**_Ques 1: Write a program to find if a number is a power of 2 or not._**

```
package aditi;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        while (number%2==0){
            number = number/2;
        }
        if (number == 1){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not power of 2");
        }
    }
}
```

**_Ques 2: Write a program to toggle a bit a position = "pos" in a number "n"._**

```
package aditi;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        //bitmask
        int bitmask = 1<<pos;
        //XOR Operation
        int newnumber = bitmask ^ n;
        System.out.println("Number after being toggled: "+newnumber);
    }
}
```

**_Ques 3: Write a program to count the number of 1’s in a binary representation of the number._**

```
package aditi;

import java.util.Scanner;

public class count1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n>0){
            if ((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Number of 1s: "+count);
    }
}
```

**_Ques 4: Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another._**

```
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
```

#### Sorting Techniques

**_Bubble Sort_**

```
package aditi;

import java.util.Scanner;

public class BubbleSort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        //int [] arr = {7, 8, 3, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        //array input
        System.out.print("Enter elements of the array: ");
        for (int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }

        //Time Complexity of Bubble Sort is: O(n^2)

        //bubble sort
        for (int i=0; i<arr.length -1; i++){
            for (int j =0; j< arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        printarray(arr); //function call
    }
}
```

**_Selection Sort_**

```
package aditi;

import java.util.Scanner;

public class SelectionSort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
//        int [] arr = {7, 8, 3, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        //array input
        System.out.print("Enter elements of the array: ");
        for (int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        
        //Time Complexity of Selection Sort is: O(n^2)
        
        //selection sort
        for (int i=0; i<arr.length -1; i++){
            int smallest = i;
            for (int j =i+1; j< arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
                //swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
        System.out.print("Sorted array is: ");
        printarray(arr); //function call
    }
}
```

## Date : 13 July 2023

### **Today's Progress**

**_Insertion Sort_**

```
package aditi;

import java.util.Scanner;

public class InsertionSort {
        public static void printarray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String[] args) {
        //int [] arr = {7, 8, 3, 1, 2};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            int [] arr = new int[size];

            //array input
            System.out.print("Enter elements of the array: ");
            for (int i=0;i< size;i++){
                arr[i] = sc.nextInt();
            }

            //Time Complexity of Insertion Sort is: O(n^2)

            //insertion sort
            for (int i=1; i<arr.length; i++){
                int current = arr[i];
                int j = i-1;
                while (j>=0 && current < arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
            System.out.print("Sorted array is: ");
            printarray(arr); //function call
        }

}
```

#### Recursion

**_Ques 1: Print numbers from 5 to 1 by using recursion._**

```
package aditi;

import java.util.Scanner;

public class printnumberbyRecursion {
    public static void main(String[] args) {
        //Recursion means a function calls itself.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if (n==0){    //Base case
            return;
        }
        System.out.print(n+" "); //print
        printNumbers(n-1);  //recursion
    }
}
```

**_Ques 2: Print numbers from 1 to 5 by using recursion._**

```
package aditi;

import java.util.Scanner;

public class printnumberbyRecursion2 {
    public static void main(String[] args) {
        //Recursion means a function calls itself.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if (n==6){    //Base case
            return;
        }
        System.out.print(n+" "); //print
        printNumbers(n+1);  //recursion
    }
}
```

**_Ques 3: Print sum of n natural numbers._**

```
package aditi;

import java.util.Scanner;

public class naturalnumbersum {
    public static void printsum(int i, int n, int sum){
        if (i > n){ // base condition
            System.out.println("Sum is = "+sum);
            return;
        }
        sum +=i;
        printsum(i+1, n, sum); //recursion
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printsum(1, n, 0); //function call
    }
}
```

**_Ques 4: Print factorial of number n._**

```
package aditi;

import java.util.Scanner;

public class factorialusingrecursion {
    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }

        int fact = n * factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" is: "+factorial(n));
    }
}
```

##### _Another Method_

```
package aditi;

import java.util.Scanner;

public class factorialusingrecursion {
    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fact_n_minus_1 = factorial(n-1);
        int fact_n = n * fact_n_minus_1;
        return fact_n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" is: "+factorial(n));
    }
}
```

**_Ques 5: Print the fibonacci sequence till nth term._**

```
package aditi;

import java.util.Scanner;

public class fibonacciusingrecursion {
    public static void fibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a =0 , b =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series till "+n+" is: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibonacci(a, b, n-2);
    }
}
```

**_Ques 6: Print the nth fibbonacci number._**

```
package aditi;

import java.util.Scanner;

public class fibonacciusingrecursion {
    public static int Fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int a =0 , b =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(n+"th fibonacci number is: "+Fibonacci(n-1));
    }
}
```

**_Ques 7: Print x^n(stack height = n)._**

```
package aditi;

import java.util.Scanner;

public class stack_height {
    public static int power(int x, int n){
        if(n==0){ //base case: 1
            return 1;
        }
        if(x==0){ //base case: 2
            return 0;
        }
        int xpowernminus1 = power(x, n-1);
        int xpower = x * xpowernminus1;
        return xpower;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" is: "+power(x, n));
    }
}
```

##### _Another Method_

```
package aditi;

import java.util.Scanner;

public class stack_height {
    public static int power(int x, int n){
        if(n==0){ //base case: 1
            return 1;
        }
        if(x==0){ //base case: 2
            return 0;
        }
        int pow = x * power(x,n-1);
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" is: "+power(x, n));
    }
}
```

## Date : 14 July 2023

### **Today's Progress**

**_Ques 1: Print x^n (stack height = logn)._**

```
package aditi;

import java.util.Scanner;

public class Stack_height_logn {
    public static int power(int x, int n){
        if(n==0){ //base case: 1
            return 1;
        }
        if(x==0){ //base case: 2
            return 0;
        }
        //if n is even
        if(n%2==0){
            return power(x, n/2) * power(x, n/2);
        }
        //if n is odd
        else {
            return power(x, n/2) * power(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" is: "+power(x, n));
    }
}
```

**_Ques 2: Tower Of Hanoi
Rules: 
Only 1 disk transferred in 1 step.
Smaller disks are always kept on top of larger disks._**

```
package aditi;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void tower_of_hanoi(int n, String source, String helper, String destination){
        if (n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        tower_of_hanoi(n-1, source, destination, helper );
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        tower_of_hanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disk to be transferred: ");
        int n = sc.nextInt();
        tower_of_hanoi(n, "S", "H", "D");
    }
}


/*Time Complexity of Tower Of Hanoi is O(2^n -1) = O(2^n)
T(n) = 2T(n-1) + 1
T(n-1) = 2T(n-2) +1
T(n-2) = 2T(n-3) +1
.
.
.
T(n) = 2T(n-1)+1 = 2(2T(n-2)+1)+1 = 4T(n-2)+2+1 = 4(2T(n-3)+1)+2+1 = 8T(n-3)+4+2+1
we have to do this until we get the value of T(n-x) = 1 or n-1 = x
2^(n-1) T(1) + 2^(n-2)+2^(n-3)+.. = 2^n (ignoring -1)
 */
```

**_Ques 3: Print reverse of a string._**

```
package aditi;

import java.security.PublicKey;
import java.util.Scanner;

public class stringReverse {
    public static void Reverse_String(String s, int index){
        if (index == 0){
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        Reverse_String(s, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Reverse_String(s, s.length()-1);
    }
}
```

**_Ques 4: Print reverse of a string._**

```
package aditi;

import java.security.PublicKey;
import java.util.Scanner;

public class stringReverse {
    public static void Reverse_String(String s, int index){
        if (index == 0){
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        Reverse_String(s, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.print("Reverse String is: ");
        Reverse_String(s, s.length()-1);
    }
}

//Time complexity = O(n), where n = length of string.
```

**_Ques 5: Find first & last occurance of a element in a string._**

```
package aditi;

import java.util.Scanner;

public class FirstandLastOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void printOccurance(String s, int index, char element){
        if (index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current_character = s.charAt(index);
        if (element == current_character){
            if(first == -1){
                first = index;
            }
            else {
                last = index;
            }
        }
        printOccurance(s, index+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        printOccurance(s, 0, 'a');
    }
}


//Time complexity = O(n), where n = length of string.
```

**_Ques 6: Check if an array is sorted or not (Strictly Increasing)._**

```
package aditi;

import java.util.Scanner;

public class sorted_strictly_increasing {
    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if (arr[index] < arr[index+1]){
            //array is sorted till now
            return isSorted(arr, index+1);
        }
        else{
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input
        System.out.print("Enter array elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}

//Time complexity = O(n), where n = length of array.
```

#### _Another Method_

```
package aditi;

import java.util.Scanner;

public class sorted_strictly_increasing {
    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if (arr[index] >= arr[index+1]){
            //array is unsorted
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input
        System.out.print("Enter array elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}

//Time complexity = O(n), where n = length of array.
```

**_Ques 7: Move all 'x' to the end of the string._**

```
package aditi;

import java.util.Scanner;

public class allXatlast {
    public static void movaAllX(String s, int index, int count,String newString){
        if (index==s.length()){
            for (int i=0; i< count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current_character = s.charAt(index);
        if (current_character == 'x'){
            count++;
            movaAllX(s, index+1, count, newString);
        }
        else {
            newString += current_character;
            movaAllX(s, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.print("New String is: ");
        movaAllX(s, 0, 0, " ");
    }
}

//Time complexity = O(n), where n = length of string.
```

## Date : 15 July 2023

### **Today's Progress**

**_Ques 1: Remove duplicates in a string._**

```
package aditi;

import java.util.Scanner;

public class deleteduplicate {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char current_character = str.charAt(index);
        if (map[current_character - 'a'] == true){
            removeDuplicates(str, index+1, newString);
        }
        else {
            newString += current_character;
            map[current_character - 'a'] = true;
            removeDuplicates(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        removeDuplicates(str, 0, "");
    }
}

//Time Complexity = O(n)
```

**_Ques 2: Print all the subsequences of a string._**  (IMPORTANT)

```
package aditi;

import java.util.Scanner;

public class sub_sequences {
    public static void subsequences(String str, int index, String newString){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char current_character = str.charAt(index);

        //to be
        subsequences(str, index+1, newString+current_character);

        //or not to be
        subsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        subsequences(str, 0, "");
    }
}

//Time Complexity = O(2^n) 
```

## Date : 16 July 2023

### **Today's Progress**

**_Ques 1: Print all the unique subsequences of a string._**  (IMPORTANT)

```
package aditi;

import java.util.HashSet;
import java.util.Scanner;

public class unique_subsequence {
    public static void subsequences(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if (set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current_character = str.charAt(index);

        //to be
        subsequences(str, index+1, newString+current_character, set);

        //or not to be
        subsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
```

**_Ques 2: Print keypad pattern._**

```
package aditi;

import java.util.Scanner;

public class keypadpattern {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str, int index, String combination){
        if (index == str.length()){
            System.out.println(combination);
            return;
        }
        char current_character = str.charAt(index);
        String Mapping = keypad[current_character - '0'];

        for (int i = 0; i<Mapping.length(); i++){
            printComb(str, index+1, combination+Mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        printComb(str, 0, "");
    }
}

//Time Complexity = 4^n
```

**_Ques 3: Print all permutations of a string._**

```
package aditi;

import java.util.Scanner;

public class Permutation {
    public static void printpermutations(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char current_character = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printpermutations(newStr, permutation+current_character);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        printpermutations(str, "");
    }
}
//Time Complexity = O(n!)
```

**_Ques 4: Count total paths in a maze to move from(0,) to (n,m)._**

```
package aditi;

import java.util.Scanner;

public class total_paths {
    public static int countPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1) {
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);
        //move right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Total path is: "+ totalPaths);
    }
}
```

**_Ques 5: Place tiles of size 1 x m in a floor of size n x m._**

```
package aditi;

import java.util.Scanner;

public class tiles {
    public static int placeTiles(int n, int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
        //vertically
        int verticalPlacemants = placeTiles(n-m, m);

        //horizontally
        int horizontalPlacements = placeTiles(n-1, m);

        return verticalPlacemants + horizontalPlacements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        placeTiles(n, m);
    }
}
```

## Date : 17 July 2023

### **Today's Progress**

**_Ques 1: Find the number of ways in which you can invite n people to your party, single or in pairs._**

```
package aditi;

import java.util.Scanner;

public class waystoinviteguest {
    public static int callguest(int n){
        if (n <= 1){
            return 1;
        }
        //single
        int ways1 = callguest(n-1);

        //pair
        int ways2 = (n-1)*callguest(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of guest: ");
        int n = sc.nextInt();
        System.out.println(callguest(n));
    }
}
```

**_Ques 2: Print all the subsets of a set of first n natural numbers._**

```
package aditi;

import java.util.ArrayList;
import java.util.Scanner;

public class subsets {
    public static void printsubset(ArrayList<Integer> subset){
        for (int i = 0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if (n == 0){
            printsubset(subset);
            return;
        }
         //add
        subset.add(n);
        findSubset(n-1, subset);

        //not add
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}

//Time Complexity = O(2^n)
```

#### Backtracking

**Definition:** _Find all possible solutions & use the one you want._

## Date : 18 July 2023

### **Today's Progress**

**_Ques 1: Print all possible combinations/permutations of a given string._**

```
package aditi;

import java.util.Scanner;

public class backtracking {
    public static void printpermutation(String str, String permutation, int index){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i =0; i<str.length(); i++) {
            char curr_char = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permutation+curr_char, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        printpermutation(str, "", 0);
    }
}

//Time Complexity = n * n!
```

## Date : 19 July 2023

### **Today's Progress**

**_Ques 1: The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other._** (LeetCode Problem) [https://leetcode.com/problems/n-queens/]

```
class Solution {
    public boolean isSafe(int row, int col, char[][] board){

        //horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i=0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c = col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //upper right
        r = row;
        for(int c = col; c<board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for(int c = col; c>=0 && r<board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q')
                row += 'Q';
                else
                row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char [][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
}

//Time Complexity = n^n
```

## Date : 20 July 2023

### **Today's Progress**

**_Ques 1: Write a program to solve a Sudoku puzzle by filling the empty cells. A sudoku solution must satisfy all of the following rules:
Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells._**  (LeetCode Problem) [https://leetcode.com/problems/sudoku-solver/]

```
class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number){
        //row and column
        for(int i = 0; i<board.length; i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }
        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i = sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(number + '0')){
                return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
    
        int newRow = 0;
        int newCol = 0;
        if(col != board.length -1){
            newRow = row;
            newCol = col + 1;
        }
        else {
            newRow = row + 1;
            newCol = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board, newRow, newCol)){
                return true;
            }
        } 
        else{
                for(int i =1; i<=9; i++){
                    if(isSafe(board, row, col, i)){
                        board[row][col] = (char)(i + '0');
                        if(helper(board, newRow, newCol))
                            return true;
                        else
                            board[row][col] = '.';
                    }
                }
            }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
```

## Date : 21 July 2023

### **Today's Progress**

**_Ques 1: Merge Sort_**

```
package aditi;

public class MergeSort {
    //Time Complexity = nlogn
    public static void conquer(int arr[], int s, int mid, int e){
        int merge[] = new int[e - s + 1];

        int idx1 = s;
        int idx2 = mid+1;
        int x = 0;

        //O(n)
        while(idx1<= mid && idx2 <= e){
            if(arr[idx1]<= arr[idx2]){
                merge[x] = arr[idx1];
                x++;
                idx1++;
            }
            else{
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<= mid){
            merge[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= e){
            merge[x] = arr[idx2];
            x++;
            idx2++;
        }
        for (int i =0, j=s; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
    //O(logn)
    public static void divide(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int mid = s + (e - s)/2; //(s+e)/2
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        conquer(arr, s, mid , e);
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        //print
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
```

**_Ques 2: Quick Sort_**

```
package aditi;

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return  i; //pivot index
    }
    public static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }
    public static void main(String[] args) {
        int arr [] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        //print
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
```

_Time Complexity of Quick Sort:_

**Worst Case:** _O(n^2)_ {Worst Case occur when pivot is always the smallest or the largest element & this case will occur when the array is already sorted either in ascending or in descending order.}
This is because in each level we will run a loop and in 1st level loop runs n times, in 2nd level loop runs n-1 times and so on decreases by 1, and we will go till we not get 1. Now sum of time consumed in all these levels will be as: n+(n-1)+(n-2)+....+1 = (n*(n-1))/2 = n^2 

**Average Case:** _O(nlogn)_ 

## Date : 22 July 2023

### **Today's Progress**

#### Object Oriented Programming (OOPS)

**_Ex 1:_**

```
package aditi;
class Pen{
    String color;
    String type; //ball pen, gel pen.

    public void write(){
        System.out.println("Writing Something.");
    }
    public void printcolour(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}
public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen(); //object
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball pen";

        Pen pen3 = new Pen();
        pen3.color = "red";
        pen3.type = "sketch";

        pen1.printcolour();
        pen1.printtype();

        pen2.printcolour();
        pen2.printtype();

        pen3.printcolour();
        pen3.printtype();
    }
}
```

**_Ex 2:_**

```
package aditi;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPS_EX2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditi";
        s1.age = 19;

        s1.printInfo();
    }
}
```

##### Constructor

**_Ex 2.1: Non-Parameterized Constructor_**

```
package aditi;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){ //Non-Parameterized constructor
        System.out.println("Constructor called");
    }  
}
public class OOPS_EX2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditi";
        s1.age = 19;

        s1.printInfo();
    }
}
```

**_Ex 2.2: Parameterized Constructor_**

```
package aditi;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){ //Parameterized constructor
        this.name = name;
        this.age = age;
    }
}
public class OOPS_EX2 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditi", 19);

        s1.printInfo();
    }
}
```

**_Ex 2.3: Copy Constructor_**

```
package aditi;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){ //Copy Constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}
public class OOPS_EX2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditi";
        s1.age = 19;

        Student s2 = new Student(s1);
        s1.printInfo();
    }
}
```
#### Polymorphism

**_Ex 3.1: Compile-Time Polymorphism (Method Overloading)_**

```
package aditi;
class Students{
    String name;
    int age;

    //POLYMORPHISM
    //1. Compile-Time Polymorphism (Method Overloading)
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class OOPS_EX3 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Aditi";
        s1.age = 19;

        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);
    }
}
```

## Date : 23 July 2023

### **Today's Progress**

**_Ex 3.2: Run-Time Polymorphism (Method Overriding)_**

```
package aditi;

//3. Hierarchical Inheritance
class  Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int b, int h){
        System.out.println((1/2)*b*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((22/7)*r*r);
    }
}
```

#### Inheritance 

**_Ex 4:_**

```
package aditi;
class Shape{ //base class/parent class
    String color;
}
//INHERITANCE
class Triangle extends Shape{ //subclass/child class
    //No color is defined here but still no error occurs means Triangle class inherits the property of Shape class.
}
public class OOPS_EX4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
```

**_Ex 4.1: Single Level Inheritance_**

```
package aditi;

//1. Single Level Inheritance
class  Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int b, int h){
        System.out.println((1/2)*b*h);
    }
}
```

**_Ex 4.2: Multi Level Inheritance_**

```
package aditi;

//2. Multi Level Inheritance
class  Shape{ 
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int b, int h){
        System.out.println((1/2)*b*h);
    }
}
class Equilateraltriangle extends Triangle{
    public void area(int b, int h){
        System.out.println((1/2)*b*h);
    }
}
```

**_Ex 4.3: Hierarchical Inheritance_**

```
package aditi;

//3. Hierarchical Inheritance
class  Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int b, int h){
        System.out.println((1/2)*b*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((22/7)*r*r);
    }
}
```

## Date : 24 July 2023

### **Today's Progress**

#### Access Modifiers

```
package bank;
class Account{
    public String name;
    //default exist by default, no need to create that.
    protected String email;
    private String password;

    //getters & setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "Apna College";
        ac1.email = "apmacollege@gmail.com";

        ac1.setPassword("abcd");
        System.out.println(ac1.getPassword());
    }
}
```

#### Abstraction

**_Ex 5.1: Abstract Class_**

```
package aditi;
//ABSTRACTION
abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("animal eats");
    }
}
class Horse extends Animal{
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}
public class OOPS_EX5 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eats();
    }
}
```

**_Ex 5.1.1: Constructor chaining_**

```
package aditi;
//ABSTRACTION
abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("animal eats");
    }
    Animal() {
        System.out.println("created a new Animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}
public class OOPS_EX5 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
    }
}
```

**_Ex 5.2: Interfaces_**

```
package aditi;
//ABSTRACTION -> INTERFACES
interface Animals{
    int eyes = 2;
    void walk();
}
interface Herbivore{
    
}
class Horses implements Animals, Herbivore{  //Multiple inheritance -> in java not happens from classes but from interfaces
    public void walk(){
        System.out.println("walks on 4 legs");
    }
            
}
public class OOPS_EX5_1 {
    public static void main(String[] args) {
        Horses h1 = new Horses();
        h1.walk();
    }
}
```

## Date : 25 July 2023

### **Today's Progress**

**_Ex 6: Static Keyword_**

```
package aditi;
class Stu_dent{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }
}
public class Static_keyword {
    public static void main(String[] args) {
        Stu_dent.school = "DAV";
        Stu_dent s1 = new Stu_dent();
        s1.name = "Aditi";
        System.out.println(s1.school);

    }
}
```

**_Ques 1: ArrayList in Java_**

```
package aditi;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

/* Heap Memory, size not fixed, non-contiguous, create objects, perform operations -> add, get, modify, delete/remove, iterate.*/

class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // or ArrayList<Integer> list = new ArrayList<>();
        /*ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        By the we can create array list for strings and booleans as well.
         */

        //add a elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element = list.get(1);
        System.out.println(element);
        //System.out.println(list.get(0));

        //to add element in between
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of arraylist
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
```

## Date : 26 July 2023

### **Today's Progress**

#### Linked List

**_Ques 1: Scratch Implementation of linked List (add and remove elements from first and last of the linked list, printing linked list and getting size of linked list.)_**

```
package aditi;

/*
Linked list -> Variable Size, Non-contiguous Memory, Insert in O(1), Search in O(n). [Array list - Insert {O(n)}, Search {O(1)}]
It stores data and address of next node.
The first node is called head node and last node is tail and last element of linked list is null.
It is of 3 types -
1. Singular Linked List
2. Double Linked List
3. Circular Linked List
 */

public class linked_list {
    Node head;
    private int size;

    linked_list(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    //print
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    //delete last
    public void deletelast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.addfirst("a");
        list.addfirst("is");
        list.printList();

        list.addlast("list");
        list.printList();

        list.addfirst("This");
        list.printList();

        list.deletefirst();
        list.printList();

        list.deletelast();
        list.printList();

        System.out.println(list.getSize());
        list.addfirst("This");
        System.out.println(list.getSize());
    }
}
```

**_Ques 2: LinkedList class Implementation (Collection Framework)_**

```
package aditi;
import java.util.*;

public class linked_list_collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        list.add("of");
        list.add("Strings");
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.add(1,"my");
        System.out.println(list);
    }
}
```

**_Ques 3: Scratch Implementation (Adding and deleting element in the middle of the linked list)_**

```
//add element in the middle
    public void addInMiddle(int index, String data){
        if(index > size || index<0){
            System.out.println("INVALID INDEX VALUE");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if (head==null || index ==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++){
            if (i==index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    //delete element from the middle
    public void deleteFromMiddle(int index) {
        if (index >= size || index < 0) {
            System.out.println("INVALID INDEX VALUE");
            return;
        }

        size--;

        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nodeToDelete = currNode.next;
                currNode.next = nodeToDelete.next;
                break;
            }
            currNode = currNode.next;
        }
    }
```

## Date : 27 July 2023

### **Today's Progress**

**_Ques 1: Reversing of Linked List by Iterative Method._**

```
package aditi;

public class Reversing_LL {
    Node head;
    private int size;

    Reversing_LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    //print
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }

        Node previousNode = head;
        Node currentNode = head.next;
        while (currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            //update
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }

    public static void main(String[] args) {
        Reversing_LL list = new Reversing_LL();
        list.addfirst(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.printList();

        list.reverseIterate();
        list.printList();
    }
}
```

**_Ques 2: Reversing of Linked List by Recursive Method._**

```
package aditi;

public class Reversing_LL {
    Node head;
    private int size;

    Reversing_LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    //print
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Reversing_LL list = new Reversing_LL();
        list.addfirst(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
```

**_Ques 3: Given the head of a linked list, remove the nth node from the end of the list and return its head._** (Leetcode Problem) [https://leetcode.com/problems/remove-nth-node-from-end-of-list/]

```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        int size = 0;
        ListNode Current = head;
        while(Current != null){
            Current = Current.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode previous = head;
        int i = 1;
        while(i < indexToSearch){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return head;
    }
}
```

**_Ques 4: Given the head of a singly linked list, return true if it is a palindrome or false otherwise._** (Leetcode Problem) [https://leetcode.com/problems/palindrome-linked-list/]

```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode middle = findMiddle(head); //1st half end
        ListNode secondHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
}
```

## Date : 28 July 2023

### **Today's Progress**

**_Ques 1: Given head, the head of a linked list, determine if the linked list has a cycle in it._** (Leetcode Problem) [https://leetcode.com/problems/linked-list-cycle/]

```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode hare = head; //fast
        ListNode turtle = head; //slow

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}
```

#### Stack

**_Ques 2: Stack implementation using linked list_**

```
package aditi;

public class Stack_Class {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```

## Date : 29 July 2023

### **Today's Progress**

**_Ques 1: Stack implementation using Arraylist_**

```
package aditi;

import java.util.ArrayList;

public class Stack_Class_AL {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<Integer>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack_Class_LL.Stack s = new Stack_Class_LL.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```

**_Ques 2: Stack implementation using Java Collection Framework_**

```
package aditi;
import java.util.*;

public class Stack_Class_java_collection_framework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```

**_Ques 3: Push at bottom of the Stack._**

```
package aditi;

import java.util.*;

public class push_at_bottom_of_Stack {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```

**_Ques 4: Reversing a Stack_**

```
package aditi;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```

#### Queue

**_Ques 5: Implementation of Queue using Arrays._**

```
package aditi;

public class Queue_using_Array {
    static class Queue{
        static int array[];
        static int size;
        static int rear = -1;
        Queue(int size){
            array = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add / enqueue  O(1)
        public static void add(int data){
            if (rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            array[rear] = data;
        }

        //remove / dequeue  O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = array[0];
            for (int i=0; i<rear; i++){
                array[i] = array[i+1];
            }
            rear --;
            return front;
        }

        //peek  O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return array[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
```

**_Ques 6: Implementation of Circular Queue using Arrays._**

```
package aditi;

public class Circular_Queue {
    static class Queue{
        static int array[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int size){
            array = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1) % size == front;
        }

        //add / enqueue  O(1)
        public static void add(int data){
            if (isFull()){
                System.out.println("full queue");
                return;
            }

            //1st element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear+1) % size;
            array[rear] = data;
        }

        //remove / dequeue  O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = array[front];

            //single element condition
            if (rear == front) {
                rear = front = -1;
            }
            else {
                front = (front+1) % size;
            }
            return result;
        }

        //peek  O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return array[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
```

**_Ques 7: Implementation of Queue using Linked List._**

```
package aditi;

public class Queue_using_Linked_list {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add / enqueue  O(1)
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove / dequeue  O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail){
                tail = null;
            }
            head = head.next;

            return front;
        }

        //peek  O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
```

**_Ques 8: Implementation of Queue using Java Collection Framework._**

```
package aditi;
import java.util.*;
public class Queue_using_Java_Collection_Framework {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>(); //Interfaces k object nahi bnte, Queue is interface and linked list is class
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
```

**_Ques 9: Implementation of Queue using 2 stacks._**

```
package aditi;

import java.util.Stack;

public class Queue_using_2_Stacks {
        static class Queue{
            static Stack<Integer> s1 = new Stack<>();
            static Stack<Integer> s2 = new Stack<>();

            public static boolean isEmpty(){
                return s1.isEmpty();
            }

            public  static void add(int data){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);

                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }

            public static int remove(){
                if(isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                return s1.pop();
            }

            public static int peek(){
                if(isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                return s1.peek();
            }
        }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
```

## Date : 30 July 2023

### **Today's Progress**

**_Ques 1: Creating a tree from given preordered nodes and returning the root nodes._**

#### Trees

```
package aditi;
import java.util.*;

public class Binary_Trees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
```

**_Ques 2: Preorder Traversal in binary tree._**

```
package aditi;

public class Preorder_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static void preorder(Node root){  //root, left subtree, right subtree
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preorder(root);
    }
}

//Time Complexity - O(n)
```

**_Ques 3: Inorder Traversal in binary tree._**

```
package aditi;

public class Inorder_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static void inorder(Node root) { //left subtree, root, right subtree
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        inorder(root);
    }
}

//Time Complexity - O(n)
```

**_Ques 4: Postorder Traversal in binary tree._**

```
package aditi;

public class Postorder_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static void postorder(Node root) { //left subtree, right subtree, root
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        postorder(root);
    }
}

//Time Complexity - O(n)
```

**_Ques 5: Level Order Traversal_**

```
package aditi;
import java.util.*;

public class Level_Order_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        levelOrder(root);
    }
}

//Time Complexity - O(n)
```

**_Ques 6: Count Of Nodes._**

```
package aditi;

public class count_of_nodes_in_BT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static int CountOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = CountOfNode(root.left);
        int rightNodes = CountOfNode(root.right);

        return leftNodes + rightNodes +1;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(CountOfNode(root));
    }
}

//Time Complexity - O(n)
```

**_Ques 7: Sum Of Nodes._**

```
package aditi;

public class sum_of_nodes_in_BT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static int SumOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = SumOfNode(root.left);
        int rightSum = SumOfNode(root.right);

        return leftSum + rightSum +root.data;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(SumOfNode(root));
    }
}

//Time Complexity - O(n)
```

**_Ques 8: Height of a Tree._**

```
package aditi;

public class Height_of_a_Tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static int HeightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = HeightOfTree(root.left);
        int rightHeight = HeightOfTree(root.right);

        int TreeHeight = Math.max(leftHeight, rightHeight) + 1;
        return TreeHeight;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(HeightOfTree(root));
    }
}

//Time Complexity - O(n)
```

**_Ques 9: Diameter of a tree (Number of nodes in the longest path between any 2 nodes)_**

```
package aditi;

public class Diameter_of_a_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static int HeightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = HeightOfTree(root.left);
        int rightHeight = HeightOfTree(root.right);

        int TreeHeight = Math.max(leftHeight, rightHeight) + 1;
        return TreeHeight;
    }
    public static int diameter(Node root){
        if (root == null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = HeightOfTree(root.left) + HeightOfTree(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}

//Time Complexity - O(n^2)
```

 #### Optimized Approach for diameter of a tree.

```
package aditi;

public class Diameter_of_a_tree_Optimised_Approach {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    static class TreeInfo{
        int Height;
        int Diameter;

        TreeInfo(int Height, int Diameter){
            this.Height = Height;
            this.Diameter = Diameter;
        }
    }
    public static TreeInfo DiameterOfTree(Node root){
        if (root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = DiameterOfTree(root.left);
        TreeInfo right = DiameterOfTree(root.right);

        int MyHeight = Math.max(left.Height, right.Height) + 1;

        int diameter1 = left.Diameter;
        int diameter2 = right.Diameter;
        int diameter3 = left.Height + right.Height + 1;

        int MyDiameter = Math.max(diameter3, Math.max(diameter1, diameter2));

        TreeInfo MyInfo = new TreeInfo(MyHeight, MyDiameter);
        return MyInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(DiameterOfTree(root).Diameter);
    }
}

//Time Complexity - O(n)
```

**_Ques 10: Subtree of another tree._**

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }
        if(root == null || subRoot == null) {
            return false;
        }
        if(root.val == subRoot.val) {
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) {
            return true;
        }
        if(root == null) {
            return false;
        }
        if(root.val == subRoot.val) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
```

**_Ques 11: Sum of nodes at kth level._**

```
package aditi;
import java.util.*;

public class sum_of_nodes_at_kth_level {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left = buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static int findSumAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int sum = 0;

        while (!q.isEmpty()) {
            int nodesAtLevel = q.size();
            level++;

            while (nodesAtLevel > 0) {
                Node currNode = q.remove();
                if (level == k) {
                    sum += currNode.data;
                }

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

                nodesAtLevel--;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int k = 2;
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(findSumAtKthLevel(root, k));
    }
}
```

## Date : 31 July 2023

### **Today's Progress**


**What is a BST?**
_It is a Binary Tree, have all properties of a binary tress and also have some of its own properties._
_1. Value of left subtree nodes < Value of root node
2. Value of right subtree nodes > Value of root node
3. Left & Right subtrees are also BST with no duplicates. (by default) If duplicates will exist then it will be clearly specified in the question._

**Special Property:**
_Inorder Traversal of BST gives a (increasing) sorted sequence._

_BST makes search efficient._

**Time Complexity -** _O(H), where H = height of tree. Time complexity will be logn in only perfectly balanced trees.
worst Case Time Complexity - O(N), N = no. of nodes, such trees are called "Skewed Trees"._

**Strategy:**
_Most problems will be solved using recursion i.e., by dividing into subproblems & making recursive calls on subtrees._


**_Ques 1: Creating & inserting elements in Binary Search Tree._**

```
package aditi;

public class Binary_Search_Tree_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}

//Time Complexity - O(H)
```

**_Ques 2: Searching elements in Binary Search Tree._**

```
package aditi;

public class Search_in_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if (root.data > key){ //left subtree
            return search(root.left, key);
        }
        else if (root.data == key){
            return true;
        }
        else { //right subtree
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(search(root, 7)) {
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
}

//Time Complexity - O(H)
```


**Delete a node -**

_Case 1: No child(Leaf Node)
Delete Node & Return Null to parent_

_Case 2: One Child
Delete Node & Replace with child node_

_Case 3: Two Children
Replace value with inorder successor
Delete the node for inorder successor
(Inorder successor - left most in right subtree) & (inorder successor always have 0 or 1 child in BST)_


**_Ques 3: Deleting a node in Binary Search Tree._**

```
package aditi;

public class Delete_a_Node_in_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node delete(Node root, int val){
        if (root.data > val){
            root.left = delete(root.left, val);
        }
        else if (root.data < val){
            root.right = delete(root.right, val);
        }
        else { //root.data == val
            //case 1:
            if (root.left == null && root.right == null){
                return null;
            }
            //case 2:
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            //case 3:
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){ //left most node in right subtree
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        delete(root,5);
        inorder(root);
    }
}
```

**_Ques 4: Printing in range in Binary Search Tree._**

```
package aditi;

public class Print_in_range_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void printInRange(Node root, int X, int Y){
        if (root == null){
            return;
        }
        if (root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if (root.data >= Y){
            printInRange(root.left, X, Y);
        }
        else {
            printInRange(root.right, X, Y);
        }
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        printInRange(root, 3, 12);
    }
}
```

**_Ques 5: Print all root to leaf paths._**

```
package aditi;
import java.util.ArrayList;

public class Root_to_leaf_path {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i<path.size(); i++){
            System.out.print(path.get(i));
            if (i < path.size()-1){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        //leaf
        if (root.left == null && root.right == null){
            printPath(path);
        }
        //non-leaf
        else {
            printRoot2leaf(root.left, path);
            printRoot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        printRoot2leaf(root, new ArrayList<>());
    }
}
```

## Date : 01 August 2023

### **Today's Progress**

#### Hashing

**_Ques 1: HashSet in Java (Creating a HashSet and its basic operations)_**

_It is a very efficient data structure due to its Time Complexity.
It takes constant time of O(1) for Insert/Add, Search/Contains, Delete/Remove._

```
package aditi;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing_HashSet {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        //Size
        System.out.println("Size of set is : " + set.size());

        //Print all elements
        System.out.println(set);

        //Search - Contains
        if (set.contains(1)){
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)){
            System.out.println("Does not contains");
        }

        //Delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Does not contains 1 - we deleted 1");
        }

        //Iterator
        Iterator it = set.iterator();
        //hashNext ; next
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
```

**_Ques 2: HashMap in Java (Creating a HashMap and its basic operations)_**

```
package aditi;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing_HashMap {
    public static void main(String[] args) {
        //Country(String), Population(Integer)
        //Creation
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 125);
        map.put("US", 30);
        map.put("China", 150);

        //Print
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //SIze
        System.out.println("Size of map is : "+map.size());

        //Search
        if (map.containsKey("China")){
            System.out.println("Key is Present in the Map");
        }
        else {
            System.out.println("Key is Not Present in the Map");
        }

        System.out.println(map.get("China")); //value if exist
        System.out.println(map.get("Indo")); //null if not exist

        //Iteration (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //Delete
        map.remove("China");
        System.out.println(map);
    }
}
```

**_Ques 3: HashMap implementation in Java._**

```
package aditi;
import java.util.*;

//HashMap internally implements as an array of Linked List
//Average case Time Complexity - O(lembda) i.e, constant time O(1)
//Worst case Time Complexity - O(n)

public class HashMapCode {
    static class HashMap<K, V> { //generics , parameterized types
        private class Node {
            K key;
            V value;

            public Node(K key,  V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n - total number of nodes
        private int N; //N - total number of buckets
        private LinkedList<Node> buckets[]; //N = bucket.length

        //@SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K key){ // 0 - N-1
            int bucket_index = key.hashCode();
            return Math.abs(bucket_index) % N; //makes -ive value to +ive because bucket_index can return both +ve and -ive value but we need only +ive values so Math.abs convert -ive value to positive.
        }

        private int searchInLinkedList(K key, int bucket_index){
            LinkedList<Node> LL = buckets[bucket_index];
            for (int i=0; i<LL.size(); i++){
                if (LL.get(i).key == key){
                    return i; // data_index
                }
            }
            return -1;
        }

        //@SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for (int i=0; i<oldBucket.length; i++){
                LinkedList<Node> LL = oldBucket[i];
                for (int j =0; j< LL.size(); j++){
                    Node node = LL.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                buckets[bucket_index].add(new Node(key, value));
                n++;
            }
            else { //key exist
                Node node = buckets[bucket_index].get(data_index);
                node.value = value;
            }

            double lembda = (double) n/N;
            if (lembda > 2.0){
                //rehashing
                rehash();
            }
        }

        public boolean containKey(K key){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                return false;
            }
            else { //key exist
                return true;
            }
        }

        public V remove(K key){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                return null;
            }
            else { //key exist
                Node node = buckets[bucket_index].remove(data_index);
                n--;
                return node.value;
            }
        }

        public V get(K key){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                return null;
            }
            else { //key exist
                Node node = buckets[bucket_index].get(data_index);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i=0; i<buckets.length; i++){ //bucket_index
                LinkedList<Node> LL = buckets[i];
                for (int j =0; j< LL.size(); j++){ //data_index
                    Node node = LL.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys  = map.keySet();
        for (int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}
```

## Date : 02 August 2023

### **Today's Progress**

**_Ques 1: Majority element – Given an integer array of size n, find all elements that appears more than [n/3] times.
nums [] = {1, 3, 2, 5, 1, 3, 1, 5, 1} , nums [] = {1, 2}_**

```
package aditi;
import java.util.*;

public class Majority_Element {
    public static void MajorityElement(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()){
            if (map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        //int nums [] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; //1
        int nums [] = {1, 2}; //1, 2
        MajorityElement(nums);
    }
}
```

**_Ques 2: Union of 2 arrays._**

```
package aditi;
import java.util.*;

public class Union_of_2_arrays {
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        System.out.println("Elements of set are: " + set);
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println("Size of array is: " + union(arr1, arr2));
    }
}

//Time Complexity - O(n)
```

**_Ques 3: Intersection of 2 arrays._**

```
package aditi;
import java.util.*;

public class Intersection_of_2_arrays {
    public static int intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j=0; j<arr2.length; j++){
            if (set.contains(arr2[j])){
                count++;
                arr.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        System.out.println("Common elements are: " + arr);
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println("Number of common elements: " + intersection(arr1, arr2));
    }
}
```

**_Ques 4: Find Itinerary from Tickets._**

```
package aditi;
import java.util.HashMap;

public class Itinerary_from_tickets {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> reverse_Map = new HashMap<>();
        for (String key : tick.keySet()){
            //key -> key ; value -> tick.get(key)
            reverse_Map.put(tick.get(key), key);
        }
        for (String key : tick.keySet()){
            if (!reverse_Map.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String > tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while (tickets.containsKey(start)){
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
```

**_Ques 5: Subarray sum equal to K._**

```
package aditi;
import java.util.HashMap;

public class Subarray_sum_equal_to_k {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>(); //sum, frequency
        map.put(0, 1); //empty subarray

        int ans = 0;
        int sum = 0;
        for (int j=0; j< arr.length; j++){
            sum += arr[j];

            if (map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            if (map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }
            else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
```

## Date : 03 August 2023

### **Today's Progress**

#### Trie Data Structure

_Also known as Prefix Tree, Digital Search Tree and Retrieval Tree. It is used to retrieve data._
_1.	Tries are used for fast search O(L), where L = Length of word.
2.	Root is an empty node.
3.	Prefix is not repeated._

**_Ques 1: Creating a trie data structures and performing insert and search operation._**

```
package aditi;
public class Trie_DS {
    //Creating Trie Data Structure
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; //if all characters then size = 256
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();
    //Insert
    public static void insert(String word){
        Node current = root;
        for (int i=0; i<word.length(); i++){  //Time Complexity of loop or insert is O(L), where L is length of word
            int index = word.charAt(i)-'a';
            if (current.children[index] == null){
                //add new node
                current.children[index] = new Node();
            }
            if (i == word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    //Search
    public static boolean search(String key){
        Node current = root;
        for (int i=0; i<key.length(); i++){  //Time Complexity of loop or search is O(L), where L is length of key
            int index = key.charAt(i)-'a';
            Node node = current.children[index];
            if (node == null){
                return false;
            }
            if (i == key.length()-1 && node.endOfWord == false){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("their")); //true
        System.out.println(search("thor")); //false
        System.out.println(search("an")); //false
    }
}
```

## Date : 04 August 2023

### **Today's Progress**

**_Ques 1: Word Break Problem - Given an input string and a dictionary of words, find out if the input string can be broken into a space-separated sequence of dictionary words.

```
package aditi;

public class WordBreakProblem {
    //Creating Trie Data Structure
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; //if all characters then size = 256
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();
    //Insert
    public static void insert(String word){
        Node current = root;
        for (int i=0; i<word.length(); i++){  //Time Complexity of loop or insert is O(L), where L is length of word
            int index = word.charAt(i)-'a';
            if (current.children[index] == null){
                //add new node
                current.children[index] = new Node();
            }
            if (i == word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    //Search
    public static boolean search(String key){
        Node current = root;
        for (int i=0; i<key.length(); i++){  //Time Complexity of loop or search is O(L), where L is length of key
            int index = key.charAt(i)-'a';
            Node node = current.children[index];
            if (node == null){
                return false;
            }
            if (i == key.length()-1 && node.endOfWord == false){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if (key.length() == 0){
            return true;
        }
        for (int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if (search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
```

**_Ques 2: StartsWith Problem - Create a function boolean startsWith(String prefix) for trie. Return true if there is a previously inserted string word that has the prefix, and false otherwise._**

```
package aditi;

public class StartsWithProblem {
    //Creating Trie Data Structure
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; //if all characters then size = 256
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();
    //Insert
    public static void insert(String word){
        Node current = root;
        for (int i=0; i<word.length(); i++){  //Time Complexity of loop or insert is O(L), where L is length of word
            int index = word.charAt(i)-'a';
            if (current.children[index] == null){
                //add new node
                current.children[index] = new Node();
            }
            if (i == word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    //Search prefix
    public static boolean startsWith(String prefix){
        Node current = root;
        for (int i=0; i<prefix.length(); i++){  //Time Complexity of loop or search is O(L), where L is length of key
            int index = prefix.charAt(i)-'a';
            if (current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
    }
}
```

**_Ques 3: Count Unique Substrings - Given a string of length n of lowercase alphabet characters, we need to count total number of distinct substrings of this string._**

**Steps Performed:**
_1. Find all suffix of string.
2. Create a trie from suffix.
3. Find unique prefixes = total nodes of trie. i.e, count nodes of trie._

```
package aditi;

public class CountUniqueSubstrings {
    //Creating Trie Data Structure
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; //if all characters then size = 256
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();
    //Insert
    public static void insert(String word){
        Node current = root;
        for (int i=0; i<word.length(); i++){  //Time Complexity of loop or insert is O(L), where L is length of word
            int index = word.charAt(i)-'a';
            if (current.children[index] == null){
                //add new node
                current.children[index] = new Node();
            }
            if (i == word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    public static int countNodes(Node root){
        if (root == null){
            return 0;
        }
        int count = 0;
        for (int i=0; i<26; i++){
            if (root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String str = "ababa";
        for (int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
```

**_Ques 4: Longest Word with all Prefixes - Find the longest string in words such that every prefix of it is also in words._**

```
package aditi;

public class LongestWordWithAllPrefixes {
    //Creating Trie Data Structure
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; //if all characters then size = 256
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();
    //Insert
    public static void insert(String word){
        Node current = root;
        for (int i=0; i<word.length(); i++){  //Time Complexity of loop or insert is O(L), where L is length of word
            int index = word.charAt(i)-'a';
            if (current.children[index] == null){
                //add new node
                current.children[index] = new Node();
            }
            if (i == word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    public static String ans = " ";
    public static void longestWord(Node root, StringBuilder temp){
        if (root == null){
            return;
        }
        for (int i=0; i<26; i++){
            if (root.children[i] != null && root.children[i].endOfWord == true){
                temp.append((char)(i + 'a'));
                if (temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp );
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(" "));
        System.out.println(ans);
    }
}
```

## Date : 05 August 2023

### **Today's Progress**

#### Graphs

**_Ques 1: Creating graph using Adjacency List (Un-directed, Un-weighted)_**

```
package aditi;
import java.util.ArrayList;

public class Graphs_UD_UW {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        //Print 2's neighbours
        for (int i=0; i< graph[1].size(); i++){
            Edge e = graph[1].get(i);
            System.out.print(e.destination);
            if (i != graph[1].size()-1) {
                System.out.print(", ");
            }
        }
    }
}
```

**_Ques 2: Creating graph using Adjacency List (Un-directed, Weighted)_**

```
package aditi;

import java.util.ArrayList;

public class Graphs_UD_W {
    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt){
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        //Print 2's neighbours
        for (int i=0; i< graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.destination + "," + e.weight);
        }
    }
}
```

## Date : 06 August 2023

### **Today's Progress**

**_Ques 1: Breadth First Search (BFS)_**

```
package aditi;
import java.util.*;
//Time Complexity = O(V+E)
public class Breadth_First_Search_BFS {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void BFS(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean visited_array[] = new boolean[V];
        q.add(0);

        while (!q.isEmpty()){
            int current = q.remove();
            if (visited_array[current] == false){
                System.out.print(current + " ");
                visited_array[current] = true;
                for (int i=0; i<graph[current].size(); i++){
                    Edge e = graph[current].get(i);q.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        /*
            1 --- 3 \
           /      |  \
          0       |   5 -- 6
           \      |  /
            2 --- 4 /
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        BFS(graph, V);
        System.out.println();
    }
}
```

**_Ques 2: BFS for disconnected graph._**

```
package aditi;
import java.util.*;
//Time Complexity = O(V+E)
public class BFS_Disconnected_Graph {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void BFS(ArrayList<Edge> graph[], int V, boolean visited_array[], int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()){
            int current = q.remove();
            if (visited_array[current] == false){
                System.out.print(current + " ");
                visited_array[current] = true;
                for (int i=0; i<graph[current].size(); i++){
                    Edge e = graph[current].get(i);q.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        /*
            0-1-2-3
            4-5-6
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean visited_array[] = new boolean[V];
        for (int i=0; i<V; i++){
            if (visited_array[i] == false){
                BFS(graph, V, visited_array, i);
            }
        }
        System.out.println();
    }
}
```

## Date : 07 August 2023

### **Today's Progress**

**_Ques 1: Depth First Search (DFS)_**

```
package aditi;
import java.util.*;
//Time Complexity = O(V+E)
public class Depth_First_Search_DFS {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void DFS(ArrayList<Edge> graph[], int current, boolean visited_array[]){
        System.out.print(current + " ");
        visited_array[current] = true;
        for (int i=0; i< graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (visited_array[e.destination] == false) {
                DFS(graph, e.destination, visited_array);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
       /*
            1 --- 3 \
           /      |  \
          0       |   5 -- 6
           \      |  /
            2 --- 4 /
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean visited_array[] = new boolean[V];
        DFS(graph, 0, visited_array);
        System.out.println();
    }
}
```

**_Ques 2: DFS for disconnected graph._**

```
package aditi;
import java.util.*;
//Time Complexity = O(V+E)
public class DFS_Disconnected_Graph {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void DFS(ArrayList<Edge> graph[], int current, boolean visited_array[]){
        System.out.print(current + " ");
        visited_array[current] = true;
        for (int i=0; i< graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (visited_array[e.destination] == false) {
                DFS(graph, e.destination, visited_array);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
       /*
            0-1-2-3
            4-5-6
        */
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean visited_array[] = new boolean[V];
        for (int i=0; i<V; i++){
            if (visited_array[i] == false){
                DFS(graph, i, visited_array);
            }
        }
        System.out.println();
    }
}
```

## Date : 08 August 2023

### **Today's Progress**

**_Ques 1: All paths from Source to Target - For given source and target, print all paths that exist from source to target._**

```
package aditi;

import java.util.ArrayList;

public class all_paths_from_Source_to_Target {
    static class Edge {
        int source;
        int destination;

        public Edge(int src, int dest) {
            this.source = src;
            this.destination = dest;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void DFS(ArrayList<Edge> graph[], int current, boolean visited_array[]) {
        System.out.print(current + " ");
        visited_array[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (visited_array[e.destination] == false) {
                DFS(graph, e.destination, visited_array);
            }
        }
    }

    //Time Complexity - O(V^V)
    public static void printAllPath(ArrayList<Edge> graph[], boolean visited_array[], int current, String path, int target) {
        if (current == target) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!visited_array[e.destination]) {
                visited_array[current] = true;
                printAllPath(graph, visited_array, e.destination, path + e.destination, target);
                visited_array[current] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
       /*
            1 --- 3 \
           /      |  \
          0       |   5 -- 6
           \      |  /
            2 --- 4 /
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        int source = 0, target = 5;
        printAllPath(graph, new boolean[V], source, "0", target);
    }
}
```

## Date : 09 August 2023

### **Today's Progress**

**_Ques 1: Cycle Detection (Directed Graph)_**

```
package aditi;
import java.util.*;

public class Cycle_Detection {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visited_array[], int current, boolean recursion[]){
        visited_array[current] = true;
        recursion[current] = true;
        for (int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (recursion[e.destination] = true){ //cycle
                return true;
            }
            else if(!visited_array[e.destination]){
                if(isCycleDirected(graph, visited_array, e.destination, recursion)) {
                    return true;
                }
            }
        }
        recursion[current] = false;
        return false;
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean visited_array[] = new boolean[V];
        boolean recursion[] = new boolean[V];
        for (int i=0; i<V; i++){
            if (!visited_array[i]){
                boolean isCycle = isCycleDirected(graph, visited_array, 0, recursion);
                if (isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
```

## Date : 10 August 2023

### **Today's Progress**

#### TOPOLOGICAL SORTING
_It is a linear order of vertices such that every directed edge u-> v, the vertex u comes before v in the order._
_1. It works for Directed Acyclic Graph (DAG).
2. Directed Acyclic Graph (DAG) is a directed graph with no cycles.
3. Topological sorting is used only for DAGs (not for non-DAGs)
4. It shows how dependency works._

**_Ques 1: _**

```
package aditi;
import java.util.*;

public class TopologicalSorting {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topologicalSortUtility(ArrayList<Edge> graph[], int current, boolean visited_array[], Stack<Integer> stack){
        visited_array[current] = true;
        for (int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (!visited_array[e.destination]){
                topologicalSortUtility(graph, e.destination, visited_array, stack);
            }
        }
        stack.push(current);
    }
    public static void topologicalSort(ArrayList<Edge> graph[], int V){
        boolean visited_array[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<V; i++){
            if (!visited_array[i]){
                topologicalSortUtility(graph, i, visited_array,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        topologicalSort(graph, V);
    }
}
//Time Complexity - O(V+E)
```

## Date : 11 August 2023

### **Today's Progress**

**_Ques 1: Cycle Detection for Undirected Graph._**

```
package aditi;
import java.util.ArrayList;

public class Cycle_Detection_Undirected_Graph {
    static class Edge {
        int source;
        int destination;

        public Edge(int src, int dest) {
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean visited_array[], int current, int parent) {
        visited_array[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (visited_array[e.destination] && e.destination != parent) {
                return true;
            } else if (!visited_array[e.destination]) {
                if (isCycleUndirected(graph, visited_array, e.destination, current)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));
    }
}

//Time Complexity - O(V+E)
```

## Date : 12 August 2023

### **Today's Progress**

**_Ques 1: Dijkstras Algorithm._**

```
package aditi;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_Algorothm {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 4, 5));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int distance;
        public Pair(int n, int d){
            this.node = n;
            this.distance = d;
        }
        @Override
        public int compareTo(Pair p2){
          return this.distance - p2.distance; //ascending
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()){
            Pair current = pq.remove(); //shortest distance
            if (!vis[current.node]){
                vis[current.node] = true;

                for (int i=0; i<graph[current.node].size(); i++){
                    Edge e = graph[current.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if (dist[u] + e.weight < dist[v]){ //relaxation
                        dist[v] = dist[u] + e.weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        dijkstra(graph, 0, V);
    }
}

//Time Complexity = O(E + E log V)
```

## Date : 13 August 2023

### **Today's Progress**

**_Ques 1: Bellman Ford Algorithm._**

```
package aditi;
import java.util.*;
//Works on bases of dynamic programming
public class Bellman_Ford_Algorithm {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int k=0; k<V-1; k++){  //O(V)
            //O(E)
            for (int i=0; i<V; i++){
                for (int j=0; j<graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.source;
                    int v = e.destination;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]){ //relaxation
                        dist[v] = dist[u] + e.weight;
                    }
                }
            }
        }
        for (int i=0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
```

## Date : 15 August 2023

### **Today's Progress**

**_Ques 1: Bellman Ford Algorithm doesn't work for negative weight cuycle and to detect that we write the following code:_**

```
package aditi;
import java.util.*;
//Works on bases of dynamic programming
public class Bellman_Ford_Algorithm {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -10));
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int k=0; k<V-1; k++){  //O(V)
            //O(E)
            for (int i=0; i<V; i++){
                for (int j=0; j<graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.source;
                    int v = e.destination;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]){ //relaxation
                        dist[v] = dist[u] + e.weight;
                    }
                }
            }
        }
        //detect -ive weight cycles
        for (int i=0; i<V; i++){
            for (int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.source;
                int v = e.destination;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]){ //relaxation
                    System.out.println("Negative weight cycle.");
                }
            }
        }
        for (int i=0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
```

#### Minimum Spanning Tree (MSP)
_A minimum spanning tree (MST) or minimum weight spanning tree is a subset of the edges of a connected, edge-weighted undirected graph that connects all the vertices together, without any cycles and with the **minimum possible total edge weight.**_

## Date : 16 August 2023

### **Today's Progress**

**_Ques 1: Prism Algorithm_**

```
package aditi;
import java.util.*;

public class Prims_Algorithm {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost; //ascending
        }
    }
    public static void primsAlgo(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[graph.length];
        pq.add(new Pair(0,0));
        int mstCost = 0;
        while (!pq.isEmpty()){
            Pair current = pq.remove();
            if (!visited[current.node]){
                visited[current.node] = true;
                mstCost += current.cost;

                for (int i=0; i<graph[current.node].size(); i++){
                    Edge e = graph[current.node].get(i);
                    if(!visited[e.destination]){
                        pq.add(new Pair(e.destination, e.weight));
                    }
                }
            }
        }
        System.out.println("min cost of mst = "+ mstCost);
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        primsAlgo(graph);
    }
}
```
