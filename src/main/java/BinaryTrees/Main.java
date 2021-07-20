package BinaryTrees;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree ;
        binaryTree = new BinaryTree(7);
        binaryTree.addBranch(new BinaryTree(3));
        binaryTree.addBranch(new BinaryTree(9));
        binaryTree.addBranch(new BinaryTree(2));
        binaryTree.addBranch(new BinaryTree(5));
        binaryTree.addBranch(new BinaryTree(4));
        binaryTree.addBranch(new BinaryTree(6));
        binaryTree.addBranch(new BinaryTree(8));
        binaryTree.addBranch(new BinaryTree(10));
        binaryTree.addBranch(new BinaryTree(12));
        binaryTree.addBranch(new BinaryTree(11));

        System.out.println(binaryTree.countNodes());
        System.out.println();

    }
}
