package aditi;

class box {
    int length, breadth, height;
    box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    box(box a){
        this.length = a.length;
        this.breadth = a.breadth;
        this.height = a.height;
    }

    int volume(){
        return length * breadth * height;
    }
}

public class CopyConst{
    public static void main(String args[]) {
        box a = new box(10, 10, 10);
        box b = new box(a);
        System.out.println("volume = " + b.volume());
    }

}
