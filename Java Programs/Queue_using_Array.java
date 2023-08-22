package aditi;

public class Queue_using_Array {
    static class Queue{
        static int array[];
        static int size;
        static int rear = -1;
        Queue(int size){
            array = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add / enqueue  O(1)
        public static void add(int data){
            if (rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            array[rear] = data;
        }

        //remove / dequeue  O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = array[0];
            for (int i=0; i<rear; i++){
                array[i] = array[i+1];
            }
            rear --;
            return front;
        }

        //peek  O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return array[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}