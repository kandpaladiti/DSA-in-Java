package aditi;
public class Trie_DS {
    //Creating Trie Data Structure
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; //if all characters then size = 256
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();
    //Insert
    public static void insert(String word){
        Node current = root;
        for (int i=0; i<word.length(); i++){  //Time Complexity of loop or insert is O(L), where L is length of word
            int index = word.charAt(i)-'a';
            if (current.children[index] == null){
                //add new node
                current.children[index] = new Node();
            }
            if (i == word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    //Search
    public static boolean search(String key){
        Node current = root;
        for (int i=0; i<key.length(); i++){  //Time Complexity of loop or search is O(L), where L is length of key
            int index = key.charAt(i)-'a';
            Node node = current.children[index];
            if (node == null){
                return false;
            }
            if (i == key.length()-1 && node.endOfWord == false){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("their")); //true
        System.out.println(search("thor")); //false
        System.out.println(search("an")); //false
    }
}