package aditi;

public class count_of_nodes_in_BT {
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
    public static int CountOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = CountOfNode(root.left);
        int rightNodes = CountOfNode(root.right);

        return leftNodes + rightNodes +1;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(CountOfNode(root));
    }
}

//Time Complexity - O(n)