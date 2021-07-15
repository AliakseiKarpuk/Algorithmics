package BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(100);
        tree.add(110);
        tree.add(111);
        tree.add(109);
        tree.add(90);
        tree.add(91);
        tree.add(89);
        System.out.println(tree.takeVisual());

        System.out.println("Количество узлов с двумя наследниками = " + tree.countNodes());

    }
}
