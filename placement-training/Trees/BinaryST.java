import java.util.*;

public class BinaryST {
    int data;
    BinaryST left;
    BinaryST right;

    BinaryST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    BinaryST(int data, BinaryST left, BinaryST right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    static BinaryST createNode(int data) {
        return new BinaryST(data);
    }

    static BinaryST createNode(int data, BinaryST left, BinaryST right) {
        return new BinaryST(data, left, right);
    }

    static BinaryST insert(BinaryST root, int data) {
        if (root == null) return createNode(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static void inorder(BinaryST root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(BinaryST root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(BinaryST root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinaryST root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        input.close();
    }
}