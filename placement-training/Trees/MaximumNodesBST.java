import java.util.*;

public class MaximumNodesBST {

    int data;
    MaximumNodesBST left;
    MaximumNodesBST right;

    MaximumNodesBST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    MaximumNodesBST(int data, MaximumNodesBST left, MaximumNodesBST right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    static MaximumNodesBST createNode(int data) {
        return new MaximumNodesBST(data);
    }

    static MaximumNodesBST createNode(int data, MaximumNodesBST left, MaximumNodesBST right) {
        return new MaximumNodesBST(data, left, right);
    }

    static MaximumNodesBST insert(MaximumNodesBST root, int data) {
        if (root == null) return createNode(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static int findMax(MaximumNodesBST root) {
        if (root == null) return -1;
        MaximumNodesBST current = root;
        while (current.right != null) current = current.right;
        return current.data;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MaximumNodesBST root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }
        
        int result = findMax(root);
        System.out.println(result);
        input.close();
    }
}