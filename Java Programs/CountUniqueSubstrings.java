package aditi;

public class CountUniqueSubstrings {
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
    public static int countNodes(Node root){
        if (root == null){
            return 0;
        }
        int count = 0;
        for (int i=0; i<26; i++){
            if (root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String str = "ababa";
        for (int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}