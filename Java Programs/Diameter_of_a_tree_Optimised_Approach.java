package aditi;

public class Diameter_of_a_tree_Optimised_Approach {
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
    static class TreeInfo{
        int Height;
        int Diameter;

        TreeInfo(int Height, int Diameter){
            this.Height = Height;
            this.Diameter = Diameter;
        }
    }
    public static TreeInfo DiameterOfTree(Node root){
        if (root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = DiameterOfTree(root.left);
        TreeInfo right = DiameterOfTree(root.right);

        int MyHeight = Math.max(left.Height, right.Height) + 1;

        int diameter1 = left.Diameter;
        int diameter2 = right.Diameter;
        int diameter3 = left.Height + right.Height + 1;

        int MyDiameter = Math.max(diameter3, Math.max(diameter1, diameter2));

        TreeInfo MyInfo = new TreeInfo(MyHeight, MyDiameter);
        return MyInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(DiameterOfTree(root).Diameter);
    }
}

//Time Complexity - O(n)