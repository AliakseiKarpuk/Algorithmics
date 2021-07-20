package BinaryTrees;

public class BinaryTree {

    public BinaryTree(int key) {
        k = key;
        attendedNode = true;
        right = null;
        left = null;
    }

    private BinaryTree left;
    private BinaryTree right;
    private static int count = 0;
    private int k;
    private boolean attendedNode;

    public int countNodes() {
        findTheNodes();
        return count;
    }

    public BinaryTree addBranch(int value) {
        BinaryTree aTree = new BinaryTree(value);
        if (aTree.k > k)
            if (right != null)
                right.addBranch(value);
            else
                right = aTree;
        else if (left != null)
            left.addBranch(value);
        else
            left = aTree;

        return aTree;
    }

    public int findTheNodes() {
        int k = 0;
        if (left != null) {
            if (right != null && attendedNode) {
                k++;
                attendedNode = false;
            }
            left.findTheNodes();
        }
        if (right != null) {
            if (left != null && attendedNode) {
                k++;
                attendedNode = false;
            }
            right.findTheNodes();
        }
        return count += k;
    }
}

