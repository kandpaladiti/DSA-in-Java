package aditi;

public class LongestWordWithAllPrefixes {
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
    public static String ans = " ";
    public static void longestWord(Node root, StringBuilder temp){
        if (root == null){
            return;
        }
        for (int i=0; i<26; i++){
            if (root.children[i] != null && root.children[i].endOfWord == true){
                temp.append((char)(i + 'a'));
                if (temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp );
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(" "));
        System.out.println(ans);
    }
}