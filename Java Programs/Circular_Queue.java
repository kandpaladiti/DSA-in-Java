package aditi;

public class Circular_Queue {
    static class Queue{
        static int array[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int size){
            array = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1) % size == front;
        }

        //add / enqueue  O(1)
        public static void add(int data){
            if (isFull()){
                System.out.println("full queue");
                return;
            }

            //1st element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear+1) % size;
            array[rear] = data;
        }

        //remove / dequeue  O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = array[front];

            //single element condition
            if (rear == front) {
                rear = front = -1;
            }
            else {
                front = (front+1) % size;
            }
            return result;
        }

        //peek  O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return array[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}