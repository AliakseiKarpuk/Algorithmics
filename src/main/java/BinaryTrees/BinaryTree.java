package BinaryTrees;

public class BinaryTree {
    public BinaryTree(int key) {
        k = key;
        attendedNode = true;
    }

    private BinaryTree left;
    private BinaryTree right;
    private static int count = 0;
    private int k;
    private boolean attendedNode;

    public int countNodes() {
        this.findTheNodes();
        return count;
    }

    public BinaryTree addBranch(BinaryTree aTree) {
        if (aTree.k > k)
            if (right != null)
                right.addBranch(aTree);
            else
                right = aTree;
        else if (left != null)
            left.addBranch(aTree);
        else
            left = aTree;
        return aTree;
    }

    private void findTheNodes() {
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
        this.count += k;

    }
}

