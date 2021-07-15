package BinaryTrees;

public class BinaryTree {
    Node root = null;

    Node addToTree(Node node, int value) {
        if (node == null) {
            Node root = new Node(value);
            root.path.add(root);
            return root;
        } else if (value < node.value) {
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

    private int countNodes(Node localRoot, int count) {
        if (localRoot == null)
            return count;
        if (localRoot.getRight() != null) {
            count++;
            count = countNodes(localRoot.left, count);
            count = countNodes(localRoot.right, count);
        }
        return count;
    }

    public int countNodes() {
        return countNodes(root, 0);
    }

    void add(int value) {
        root = addToTree(root, value);
    }
}

