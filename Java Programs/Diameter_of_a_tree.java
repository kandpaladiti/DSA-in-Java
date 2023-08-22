package aditi;

public class Diameter_of_a_tree {
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
    public static int HeightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = HeightOfTree(root.left);
        int rightHeight = HeightOfTree(root.right);

        int TreeHeight = Math.max(leftHeight, rightHeight) + 1;
        return TreeHeight;
    }
    public static int diameter(Node root){
        if (root == null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = HeightOfTree(root.left) + HeightOfTree(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}

//Time Complexity - O(n^2)

