package dataProvider;

import BinaryTrees.BinaryTree;
import org.testng.annotations.DataProvider;

public class TreeData {

    @DataProvider(name = "TreeData")
    public static Object[][] data(){
        BinaryTree node = new BinaryTree(7);
        node.insertNode(3, node);
        node.insertNode(9, node);
        node.insertNode(2, node);
        node.insertNode(4, node);
        node.insertNode(8, node);
        node.insertNode(10, node);
        return new Object[][]{
                {node.nodeCountWithToHeirs(node)}
        };
    }

    @DataProvider(name = "emptyTree")
    public static Object[][] emptyTreeData(){
        BinaryTree node = new BinaryTree(7);
        return new Object[][]{
                {node.nodeCountWithToHeirs(node)}
        };
    }

    @DataProvider(name = "treeWithNegativeNumber")
    public static Object[][] treeWithNegativeAndPositiveNumberData(){
        BinaryTree node = new BinaryTree(7);
        node.insertNode(3, node);
        node.insertNode(9, node);
        node.insertNode(-2, node);
        node.insertNode(-5, node);
        node.insertNode(-4, node);
        node.insertNode(-6, node);
        node.insertNode(8, node);
        node.insertNode(10, node);
        node.insertNode(-12, node);
        node.insertNode(-11, node);
        return new Object[][]{
                {node.nodeCountWithToHeirs(node)}
        };
    }

    @DataProvider(name = "treeWithOneNode")
    public static Object[][] treeWithOneNodeData(){
        BinaryTree node = new BinaryTree(7);
        node.insertNode(3, node);
        node.insertNode(9, node);
        return new Object[][]{
                {node.nodeCountWithToHeirs(node)}
        };
    }

    @DataProvider(name = "treeWithTwoNode")
    public static Object[][] treeWithTwoNodeData(){
        BinaryTree node = new BinaryTree(7);
        node.insertNode(3, node);
        node.insertNode(9, node);
        node.insertNode(2, node);
        node.insertNode(5, node);
        return new Object[][]{
                {node.nodeCountWithToHeirs(node)}
        };
    }


}
