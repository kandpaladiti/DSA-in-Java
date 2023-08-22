package aditi;
import java.util.*;
public class Queue_using_Java_Collection_Framework {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>(); //Interfaces k object nahi bnte, Queue is interface and linked list is class
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
