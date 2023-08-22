package aditi;

class Box {
    int length, height, width;

    void setDimension(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }
}
public class Demo {
    public static void main(String[] args) {
        Box b = new Box();
        b.setDimension(10, 10, 10);
        System.out.println("Volume: " + b.volume());
    }
}