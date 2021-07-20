package BinaryTrees;

import BinaryTrees.BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insertNode(12, binaryTree);
        binaryTree.insertNode(4, binaryTree);
        binaryTree.insertNode(6, binaryTree);
        binaryTree.insertNode(5, binaryTree);
        binaryTree.insertNode(8, binaryTree);
        binaryTree.insertNode(10,binaryTree);
        binaryTree.insertNode(11,binaryTree);
        System.out.println(binaryTree.nodeCountWithToHeirs(binaryTree));

        BinaryTree binaryTrees = new BinaryTree(100);
        binaryTrees.insertNode(3, binaryTrees);
        binaryTrees.insertNode(111, binaryTrees);

        System.out.println(binaryTrees.nodeCountWithToHeirs(binaryTrees));

    }
}
