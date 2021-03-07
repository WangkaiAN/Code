package LinkedList;

public class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return " "+val;
    }
}

