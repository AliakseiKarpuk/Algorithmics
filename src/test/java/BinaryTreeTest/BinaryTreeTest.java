package BinaryTreeTest;

import BinaryTrees.BinaryTree;
import org.testng.Assert;
import org.testng.annotations.*;

public class BinaryTreeTest {

    @Test
    public void treeTest(){
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.addBranch(3);
        binaryTree.addBranch(9);
        binaryTree.addBranch(2);
        binaryTree.addBranch(5);
        binaryTree.addBranch(4);
        binaryTree.addBranch(6);
        binaryTree.addBranch(8);
        binaryTree.addBranch(10);
        binaryTree.addBranch(12);
        binaryTree.addBranch(11);

        Assert.assertEquals(binaryTree.findTheNodes(), 4);
    }

    @Test
    public void emptyTreeTest(){
        BinaryTree binaryTrees = new BinaryTree(7);
        Assert.assertEquals(binaryTrees.countNodes(), 0);
    }

    @Test
    public void treeWithNegativeNumberTest(){
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.addBranch(-3);
        binaryTree.addBranch(-9);
        binaryTree.addBranch(-2);
        binaryTree.addBranch(-5);
        binaryTree.addBranch(-4);
        binaryTree.addBranch(-6);
        binaryTree.addBranch(-8);
        binaryTree.addBranch(-10);
        binaryTree.addBranch(-12);
        binaryTree.addBranch(-11);
        Assert.assertEquals(binaryTree.countNodes(), 3);
    }

    @Test
    public void treeWithNegativeAndPositiveNumberTest(){
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.addBranch(-3);
        binaryTree.addBranch(9);
        binaryTree.addBranch(-2);
        binaryTree.addBranch(-5);
        binaryTree.addBranch(4);
        binaryTree.addBranch(-6);
        binaryTree.addBranch(-8);
        binaryTree.addBranch(10);
        binaryTree.addBranch(-12);
        binaryTree.addBranch(-11);
        Assert.assertEquals(binaryTree.countNodes(), 2);
    }

    @Test
    public void treeWithOneNode(){
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.addBranch(3);
        binaryTree.addBranch(9);

        Assert.assertEquals(binaryTree.countNodes(), 1);
    }

    @Test
    public void treeWithTwoNode(){
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.addBranch(3);
        binaryTree.addBranch(9);
        binaryTree.addBranch(2);
        binaryTree.addBranch(5);

        Assert.assertEquals(binaryTree.countNodes(), 2);
    }
}
