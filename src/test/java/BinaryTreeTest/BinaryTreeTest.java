package BinaryTreeTest;

import BinaryTrees.BinaryTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinaryTreeTest {
    BinaryTree binaryTree ;
    @Test
    public void treeTest(){
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

        Assert.assertEquals(binaryTree.countNodes(), 4);
    }

    @Test
    public void emptyTreeTest(){
        binaryTree = new BinaryTree(7);
        Assert.assertEquals(binaryTree.countNodes(), 0);
    }

    @Test
    public void treeWithNegativeNumberTest(){
        binaryTree = new BinaryTree(7);
        binaryTree.addBranch(new BinaryTree(-3));
        binaryTree.addBranch(new BinaryTree(-9));
        binaryTree.addBranch(new BinaryTree(-2));
        binaryTree.addBranch(new BinaryTree(-5));
        binaryTree.addBranch(new BinaryTree(-4));
        binaryTree.addBranch(new BinaryTree(-6));
        binaryTree.addBranch(new BinaryTree(-8));
        binaryTree.addBranch(new BinaryTree(-10));
        binaryTree.addBranch(new BinaryTree(-12));
        binaryTree.addBranch(new BinaryTree(-11));

        Assert.assertEquals(binaryTree.countNodes(), 3);
    }

    @Test
    public void treeWithNegativeAndPositiveNumberTest(){
        binaryTree = new BinaryTree(7);
        binaryTree.addBranch(new BinaryTree(-3));
        binaryTree.addBranch(new BinaryTree(9));
        binaryTree.addBranch(new BinaryTree(-2));
        binaryTree.addBranch(new BinaryTree(-5));
        binaryTree.addBranch(new BinaryTree(4));
        binaryTree.addBranch(new BinaryTree(-6));
        binaryTree.addBranch(new BinaryTree(-8));
        binaryTree.addBranch(new BinaryTree(10));
        binaryTree.addBranch(new BinaryTree(-12));
        binaryTree.addBranch(new BinaryTree(-11));

        Assert.assertEquals(binaryTree.countNodes(), 2);
    }

    @Test
    public void treeWithOneNode(){
        binaryTree = new BinaryTree(7);
        binaryTree.addBranch(new BinaryTree(3));
        binaryTree.addBranch(new BinaryTree(9));

        Assert.assertEquals(binaryTree.countNodes(), 1);
    }

    @Test
    public void treeWithTwoNode(){
        binaryTree = new BinaryTree(7);
        binaryTree.addBranch(new BinaryTree(3));
        binaryTree.addBranch(new BinaryTree(9));
        binaryTree.addBranch(new BinaryTree(2));
        binaryTree.addBranch(new BinaryTree(5));

        Assert.assertEquals(binaryTree.countNodes(), 2);
    }
}
