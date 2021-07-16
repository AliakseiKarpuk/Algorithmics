package BinaryTrees;

public class Main {

    public static void main(String[] args) {
        System.out.println("Количество узлов с двумя наследниками = " + BinaryTree.addBinaryTree
                (new int[]{100, 110, 111, 109, 90, 91, 89})
                .countNodes());
    }
}
