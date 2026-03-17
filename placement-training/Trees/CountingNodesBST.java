import java.util.*;

public class CountingNodesBST {

    int data;
    CountingNodesBST left;
    CountingNodesBST right;

    CountingNodesBST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    CountingNodesBST(int data, CountingNodesBST left, CountingNodesBST right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    static CountingNodesBST createNode(int data) {
        return new CountingNodesBST(data);
    }

    static CountingNodesBST createNode(int data, CountingNodesBST left, CountingNodesBST right) {
        return new CountingNodesBST(data, left, right);
    }

    static CountingNodesBST insert(CountingNodesBST root, int data) {
        if (root == null) return createNode(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }


    static int countNodes(CountingNodesBST root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountingNodesBST root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }
        input.close();

        int result = countNodes(root);
        System.out.println(result);
    }
}