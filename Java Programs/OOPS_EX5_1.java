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
