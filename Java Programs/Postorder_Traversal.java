package aditi;

public class Postorder_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left =  buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static void postorder(Node root) { //left subtree, right subtree, root
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        postorder(root);
    }
}