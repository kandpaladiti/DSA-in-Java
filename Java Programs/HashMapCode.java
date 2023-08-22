package aditi;
import java.util.*;

//HashMap internally implements as an array of Linked List
//Average case Time Complexity - O(lembda) i.e, constant time O(1)
//Worst case Time Complexity - O(n)

public class HashMapCode {
    static class HashMap<K, V> { //generics , parameterized types
        private class Node {
            K key;
            V value;

            public Node(K key,  V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n - total number of nodes
        private int N; //N - total number of buckets
        private LinkedList<Node> buckets[]; //N = bucket.length

        //@SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K key){ // 0 - N-1
            int bucket_index = key.hashCode();
            return Math.abs(bucket_index) % N; //makes -ive value to +ive because bucket_index can return both +ve and -ive value but we need only +ive values so Math.abs convert -ive value to positive.
        }

        private int searchInLinkedList(K key, int bucket_index){
            LinkedList<Node> LL = buckets[bucket_index];
            for (int i=0; i<LL.size(); i++){
                if (LL.get(i).key == key){
                    return i; // data_index
                }
            }
            return -1;
        }

        //@SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for (int i=0; i<oldBucket.length; i++){
                LinkedList<Node> LL = oldBucket[i];
                for (int j =0; j< LL.size(); j++){
                    Node node = LL.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                buckets[bucket_index].add(new Node(key, value));
                n++;
            }
            else { //key exist
                Node node = buckets[bucket_index].get(data_index);
                node.value = value;
            }

            double lembda = (double) n/N;
            if (lembda > 2.0){
                //rehashing
                rehash();
            }
        }

        public boolean containKey(K key){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                return false;
            }
            else { //key exist
                return true;
            }
        }

        public V remove(K key){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                return null;
            }
            else { //key exist
                Node node = buckets[bucket_index].remove(data_index);
                n--;
                return node.value;
            }
        }

        public V get(K key){
            int bucket_index = HashFunction(key); //array list ke andar index btata h
            int data_index = searchInLinkedList(key, bucket_index); //data index - linked list ke andar index btata h

            if (data_index == -1){ //key doesn't exist
                return null;
            }
            else { //key exist
                Node node = buckets[bucket_index].get(data_index);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i=0; i<buckets.length; i++){ //bucket_index
                LinkedList<Node> LL = buckets[i];
                for (int j =0; j< LL.size(); j++){ //data_index
                    Node node = LL.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys  = map.keySet();
        for (int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}