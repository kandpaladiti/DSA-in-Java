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

##### _other method of doing the above question_

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
