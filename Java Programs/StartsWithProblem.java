package aditi;

public class StartsWithProblem {
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
    //Search prefix
    public static boolean startsWith(String prefix){
        Node current = root;
        for (int i=0; i<prefix.length(); i++){  //Time Complexity of loop or search is O(L), where L is length of key
            int index = prefix.charAt(i)-'a';
            if (current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
    }
}