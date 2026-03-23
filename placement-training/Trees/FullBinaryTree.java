import java.util.*;

public class FullBinaryTree {

    int data;
    FullBinaryTree left;
    FullBinaryTree right;

    FullBinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    static FullBinaryTree insert(FullBinaryTree root, int data) {
        if (root == null) return new FullBinaryTree(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static boolean isFullBinaryTree(FullBinaryTree node) {
        if (node == null) return true;
        
        if (node.left == null && node.right == null) {
            return true;
        }
        
        if (node.left != null && node.right != null) {
            return isFullBinaryTree(node.left) && isFullBinaryTree(node.right);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FullBinaryTree root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }
        
        if (isFullBinaryTree(root)) {
            System.out.println("The tree is a FULL binary tree.");
        } else {
            System.out.println("The tree is NOT a full binary tree.");
        }
        input.close();
    }
}
