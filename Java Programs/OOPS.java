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
