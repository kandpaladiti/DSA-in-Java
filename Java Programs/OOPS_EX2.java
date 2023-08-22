package aditi;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    Student(){ //Non-Parameterized constructor
//        System.out.println("Constructor called");
//    }
//    Student(String name, int age){ //Parameterized constructor
//        this.name = name;
//        this.age = age;
//    }
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
