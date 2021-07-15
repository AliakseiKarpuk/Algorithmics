package BinaryTree;

import java.util.ArrayList;

class Node {
    public int value;
    public Node left = null;
    public Node right = null;
    ArrayList<Node> path = new ArrayList<>();


    Node(int value) {
        this.value = value;
    }
}
