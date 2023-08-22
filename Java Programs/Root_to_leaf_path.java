package aditi;
import java.util.ArrayList;

public class Root_to_leaf_path {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i<path.size(); i++){
            System.out.print(path.get(i));
            if (i < path.size()-1){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        //leaf
        if (root.left == null && root.right == null){
            printPath(path);
        }
        //non-leaf
        else {
            printRoot2leaf(root.left, path);
            printRoot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        printRoot2leaf(root, new ArrayList<>());
    }
}