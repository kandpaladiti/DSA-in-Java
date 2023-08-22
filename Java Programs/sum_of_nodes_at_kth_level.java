package aditi;
import java.util.*;

public class sum_of_nodes_at_kth_level {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node NewNode = new Node(nodes[index]);
            NewNode.left = buildTree(nodes);
            NewNode.right = buildTree(nodes);

            return NewNode;
        }
    }
    public static int findSumAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int sum = 0;

        while (!q.isEmpty()) {
            int nodesAtLevel = q.size();
            level++;

            while (nodesAtLevel > 0) {
                Node currNode = q.remove();
                if (level == k) {
                    sum += currNode.data;
                }

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

                nodesAtLevel--;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int k = 2;
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(findSumAtKthLevel(root, k));
    }
}