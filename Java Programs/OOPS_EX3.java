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
