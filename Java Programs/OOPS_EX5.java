package aditi;
//ABSTRACTION -> ABSTRACT CLASS
abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("animal eats");
    }
//    Animal() {
//        System.out.println("created a new Animal");
//    }
}
class Horse extends Animal{
//    Horse(){
//        System.out.println("created a horse");
//    }
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
