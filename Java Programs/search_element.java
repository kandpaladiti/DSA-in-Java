package aditi;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class search_element {
    private Node head;

    search_element() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int search(int target) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Return -1 if the target element is not found.
    }

    public static void main(String[] args) {
        search_element linkedList = new search_element();

        // Adding elements to the linked list.
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(3);

        // Search for the number 7 and display its index.
        int target = 7;
        int index = linkedList.search(target);

        if (index != -1) {
            System.out.println("The index of " + target + " is: " + index);
        } else {
            System.out.println(target + " is not found in the linked list.");
        }
    }
}
