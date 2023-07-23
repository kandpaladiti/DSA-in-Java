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
