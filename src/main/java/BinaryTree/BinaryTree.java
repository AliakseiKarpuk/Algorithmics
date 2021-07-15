package BinaryTree;

public class BinaryTree {
    Node root = null;

    Node addToTree(Node node, int value) {
        if (node == null) {
            Node root = new Node(value);
            root.path.add(root);
            return root;
        } else
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
                node.left.path.addAll(node.path);
                node.left.path.add(node.left);
            } else {
                addToTree(node.left, value);
            }
        } else if (value > node.value) {
            if (node.right == null) {
                node.right = new Node(value);
                node.right.path.addAll(node.path);
                node.right.path.add(node.right);
            } else {
                addToTree(node.right, value);
            }
        }

        return node;
    }

    public int count() {
        BinaryTree tree = new BinaryTree();
        tree.add(3);
        tree.add(4);
        tree.add(0);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(35);
        tree.add(20);
        root = addToTree(root, root.value);

        Node right = root.right;
        Node left = root.left;
        int c = 1;
        if ( right != null && left != null){
            c++;
        }
        return c;
    }

    void add(int value) {
        root = addToTree(root, value);
    }
}
