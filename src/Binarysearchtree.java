class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    Node root;

    // Insert
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Search
    boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Find Minimum
    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // Find Maximum
    int findMax(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    // Delete Node
    Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // One or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Two children
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // Count Total Nodes
    int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Count Leaf Nodes
    int countLeafNodes(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    // Tree Height
    int height(Node root) {
        if (root == null)
            return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        BST tree = new BST();

        int[] elements = {50, 30, 70, 20, 40, 60, 80};
        for (int x : elements)
            tree.root = tree.insert(tree.root, x);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);

        System.out.println("\nSearch 60: " + tree.search(tree.root, 60));

        tree.root = tree.delete(tree.root, 80);
        System.out.print("After deleting 80 (Inorder): ");
        tree.inorder(tree.root);

        System.out.println("\nMinimum: " + tree.findMin(tree.root));
        System.out.println("Maximum: " + tree.findMax(tree.root));

        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf Nodes: " + tree.countLeafNodes(tree.root));
        System.out.println("Tree Height: " + tree.height(tree.root));
    }
}