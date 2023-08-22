package aditi;

/*
Linked list -> Variable Size, Non-contiguous Memory, Insert in O(1), Search in O(n). [Array list - Insert {O(n)}, Search {O(1)}]
It stores data and address of next node.
The first node is called head node and last node is tail and last element of linked list is null.
It is of 3 types -
1. Singular Linked List
2. Double Linked List
3. Circular Linked List
 */

public class linked_list {
    Node head;
    private int size;

    linked_list(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    //print
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    //delete last
    public void deletelast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    //add element in the middle
    public void addInMiddle(int index, String data){
        if(index > size || index<0){
            System.out.println("INVALID INDEX VALUE");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if (head==null || index ==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++){
            if (i==index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    //delete element from the middle
    public void deleteFromMiddle(int index) {
        if (index >= size || index < 0) {
            System.out.println("INVALID INDEX VALUE");
            return;
        }

        size--;

        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nodeToDelete = currNode.next;
                currNode.next = nodeToDelete.next;
                break;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.addfirst("a");
        list.addfirst("is");
        list.printList();

        list.addlast("list");
        list.printList();

        list.addfirst("This");
        list.printList();

        list.deletefirst();
        list.printList();

        list.deletelast();
        list.printList();

        System.out.println(list.getSize());
        list.addfirst("This");
        System.out.println(list.getSize());

        list.addInMiddle(2, "hey");
        list.printList();

        list.deleteFromMiddle(2);
        list.printList();
    }
}
