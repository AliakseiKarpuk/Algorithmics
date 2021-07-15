package BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(3);
        tree.add(34);
        tree.add(0);
        tree.add(323);
        tree.add(6);
        tree.add(7);
        tree.add(34);
        tree.add(233);
        System.out.println(tree.count());

    }
}
