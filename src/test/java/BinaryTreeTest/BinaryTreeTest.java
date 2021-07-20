package BinaryTreeTest;

import BinaryTrees.BinaryTree;
import dataProvider.TreeData;
import org.testng.Assert;
import org.testng.annotations.*;

public class BinaryTreeTest {

    @Test(dataProvider = "TreeData", dataProviderClass = TreeData.class)
    public void treeTest(int value){
        Assert.assertEquals(value, 3);
    }

    @Test(dataProvider = "emptyTree", dataProviderClass = TreeData.class)
    public void emptyTreeTest(int value){
        Assert.assertEquals(value, 0);
    }

    @Test(dataProvider = "treeWithNegativeNumber", dataProviderClass = TreeData.class)
    public void treeWithNegativeAndPositiveNumberTest(int value){
        Assert.assertEquals(value, 3);
    }

    @Test(dataProvider = "treeWithOneNode", dataProviderClass = TreeData.class)
    public void treeWithOneNode(int value){
        Assert.assertEquals(value, 1);
    }

    @Test(dataProvider = "treeWithTwoNode", dataProviderClass = TreeData.class)
    public void treeWithTwoNode(int value){
        Assert.assertEquals(value, 2);
    }
}
