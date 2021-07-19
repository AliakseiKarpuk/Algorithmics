package BinaryTreeTest;

import BinaryTrees.BinaryTree;
import BinaryTrees.Node;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinaryTreeTest {

    @Test
    public void addToTreeTest(){
        BinaryTree tree = new BinaryTree();
        Assert.assertTrue(tree.add(2));
    }

    @Test
    public void treeTest(){

        BinaryTree tree = new BinaryTree();
        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(2);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(10);
        tree.add(12);
        tree.add(11);

        Assert.assertEquals(tree.countOfNodes(tree.root), 4);
    }

    @Test
    public void emptyTreeTest(){

        BinaryTree tree = new BinaryTree();

        Assert.assertEquals(tree.countOfNodes(tree.root), 0);
    }
}
