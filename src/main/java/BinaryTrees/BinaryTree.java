package BinaryTrees;

public class BinaryTree {
    public Node root = null;

    private Node addToTree(Node node, int value) {
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

    public int countOfNodes (Node node) {
        if(node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 0;
        } else {
            return countOfNodes(node.left) + countOfNodes(node.right) + 1;
        }
    }

    public boolean add(int value) {
        try {
            root = addToTree(root, value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}

