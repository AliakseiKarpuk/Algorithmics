package BinaryTrees;

import lombok.Data;

@Data
public class BinaryTree {

    public BinaryTree left;
    public BinaryTree right;
    int data;
    boolean flag = true;

    public BinaryTree(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void insertNode(int data, BinaryTree node) {
        if (node.data < data)
            if (node.right == null)
                node.right = new BinaryTree(data);
            else insertNode(data, node.right);
        else if (node.left == null)
            node.left = new BinaryTree(data);
        else insertNode(data, node.left);
    }

    public int nodeCountWithToHeirs(BinaryTree node) {
        int result;
        if ((node.left == null) && (node.right == null)) {
            result = 0;
        } else result = 1;
        if (node.left != null && node.right != null) {
            result += nodeCountWithToHeirs(node.left);
            result += nodeCountWithToHeirs(node.right);
        }
        return result;
    }
}

