import java.util.*;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    static Node createNode(int data) {
        return new Node(data);
    }

    static Node createNode(int data, Node left, Node right) {
        return new Node(data, left, right);
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input root:");
        int x = input.nextInt();

        System.out.println("input left:");
        int y = input.nextInt();

        System.out.println("input right:");
        int z = input.nextInt();

        Node left = createNode(y);
        Node right = createNode(z);
        Node root = createNode(x, left, right);

        System.out.println("Root: " + root.data);
        System.out.println("Left: " + root.left.data);
        System.out.println("Right: " + root.right.data);

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