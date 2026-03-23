import java.util.*;

public class BalancedBST {

    int data;
    BalancedBST left;
    BalancedBST right;

    BalancedBST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    static BalancedBST insert(BalancedBST root, int data) {
        if (root == null) return new BalancedBST(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static int getHeight(BalancedBST node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    static boolean isBalanced(BalancedBST root) {
        if (root == null) return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 
                && isBalanced(root.left) 
                && isBalanced(root.right);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BalancedBST root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }
        
        if (isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is NOT balanced.");
        }
        input.close();
    }
}
