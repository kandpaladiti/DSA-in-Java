package aditi;

public class Reversing_LL {
    Node head;
    private int size;

    Reversing_LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addlast(int data){
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
    
//    public void reverseIterate(){
//        if (head == null || head.next == null){
//            return;
//        }
//
//        Node previousNode = head;
//        Node currentNode = head.next;
//        while (currentNode != null){
//            Node nextNode = currentNode.next;
//            currentNode.next = previousNode;
//
//            //update
//            previousNode = currentNode;
//            currentNode = nextNode;
//        }
//        head.next = null;
//        head = previousNode;
//    }
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        Reversing_LL list = new Reversing_LL();
        list.addfirst(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.printList();

//        list.reverseIterate();
//        list.printList();
        
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
