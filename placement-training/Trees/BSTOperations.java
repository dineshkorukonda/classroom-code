import java.util.*;

public class BSTOperations {
    int data;
    BSTOperations left;
    BSTOperations right;

    BSTOperations(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    static BSTOperations createNode(int data) {
        return new BSTOperations(data);
    }

    static BSTOperations insert(BSTOperations root, int data) {
        if (root == null) return createNode(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static boolean search(BSTOperations root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    static int countNodes(BSTOperations root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    static int height(BSTOperations root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int findMin(BSTOperations root) {
        if (root == null) return -1;
        BSTOperations current = root;
        while (current.left != null) current = current.left;
        return current.data;
    }

    static int findMax(BSTOperations root) {
        if (root == null) return -1;
        BSTOperations current = root;
        while (current.right != null) current = current.right;
        return current.data;
    }

    static void inorder(BSTOperations root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BSTOperations root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.println("Total Nodes: " + countNodes(root));
        System.out.println("Height of Tree: " + height(root));

        if (root != null) {
            System.out.println("Minimum Value: " + findMin(root));
            System.out.println("Maximum Value: " + findMax(root));
        }

        System.out.print("Enter value to search: ");
        int key = input.nextInt();
        if (search(root, key)) {
            System.out.println(key + " found in the BST.");
        } else {
            System.out.println(key + " not found.");
        }

        input.close();
    }
}
