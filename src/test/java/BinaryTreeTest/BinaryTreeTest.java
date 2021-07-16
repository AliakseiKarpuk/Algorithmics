package BinaryTreeTest;

import BinaryTrees.BinaryTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinaryTreeTest {

    @Test
    public void valueWithThreeNodeTest(){
        Assert.assertEquals(BinaryTree.addBinaryTree(new int[]{100, 110, 111, 109, 90, 91, 89}).countNodes(), 3);
    }

    @Test
    public void emptyValueTest(){
        Assert.assertEquals(BinaryTree.addBinaryTree(new int[]{}).countNodes(), 0);
    }

    @Test
    public void valueWithoutNodeTest(){
        Assert.assertEquals(BinaryTree.addBinaryTree(new int[]{100, 10, 9, 8, 7}).countNodes(), 0);
    }

    @Test
    public void valueWithTwoNodeTest(){
        Assert.assertEquals(BinaryTree.addBinaryTree(new int[]{100, 10, 9, 8, 110}).countNodes(), 1);
    }

    @Test
    public void negativeValueTest(){
        Assert.assertEquals(BinaryTree.addBinaryTree(new int[]{-100, -110, -111, -109, -90, -91, -89}).countNodes(), 3);
    }

    @Test
    public void negativeAndPositiveNumberTest(){
        Assert.assertEquals(BinaryTree.addBinaryTree(new int[]{100, -110, 111, -109, 90, 91, -89}).countNodes(), 1);
    }
}
