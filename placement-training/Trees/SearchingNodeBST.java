import java.util.*;

public class SearchingNodeBST {

    int data;
    SearchingNodeBST left;
    SearchingNodeBST right;

    SearchingNodeBST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    SearchingNodeBST(int data, SearchingNodeBST left, SearchingNodeBST right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    static SearchingNodeBST createNode(int data) {
        return new SearchingNodeBST(data);
    }

    static SearchingNodeBST createNode(int data, SearchingNodeBST left, SearchingNodeBST right) {
        return new SearchingNodeBST(data, left, right);
    }

    static SearchingNodeBST insert(SearchingNodeBST root, int data) {
        if (root == null) return createNode(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static boolean search(SearchingNodeBST root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SearchingNodeBST root = null;

        System.out.println("Enter values for BST (enter -1 to stop):");
        while (true) {
            int x = input.nextInt();
            if (x == -1) break;
            root = insert(root, x);
        }

        System.out.println("Enter value to search:");
        int key = input.nextInt();
        boolean result = search(root, key);
        System.out.println(result);
        input.close();
    }
}