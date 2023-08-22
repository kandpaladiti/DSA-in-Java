package aditi;

//import com.aditi.bank;

//class Shape{ //base class/parent class
//    String color;
//}
////INHERITANCE
//class Triangle extends Shape{ //subclass/child class
//    //No color is defined here but still no error occurs means Triangle class inherits the property of Shape class.
//}

//1. Single Level Inheritance
//class  Shape{
//    public void area(){
//        System.out.println("displays area");
//    }
//}
//class Triangle extends Shape{
//    public void area(int b, int h){
//        System.out.println((1/2)*b*h);
//    }
//}

//2. Multi Level Inheritance
//class  Shape{
//    public void area(){
//        System.out.println("displays area");
//    }
//}
//class Triangle extends Shape{
//    public void area(int b, int h){
//        System.out.println((1/2)*b*h);
//    }
//}
//class Equilateraltriangle extends Triangle{
//    public void area(int b, int h){
//        System.out.println((1/2)*b*h);
//    }
//}

//3. Hierarchical Inheritance
class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println((1 / 2) * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((22 / 7) * r * r);
    }
}

// 4. Hybrid Inheritance

public class OOPS_EX4 {
    public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//        Bank.Account ac1 = new Bank.Account();
//        ac1.password = "customer1";
    }
}
