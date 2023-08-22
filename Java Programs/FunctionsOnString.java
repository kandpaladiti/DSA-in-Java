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

