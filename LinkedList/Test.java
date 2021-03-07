package LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Node node =new Node(1);
        list.addFisrt(node);
        list.print();
        Node node1 =new Node(2);
        list.addFisrt(node1);
        list.print();
        Node node2 = new Node(0);
        list.addlast(node2);
        list.print();
        Node node3 =new Node(3);
        list.add(1,node3);
        list.print();
        list.removeByNode(node3);
        list.print();
        list.set(node,4);
        list.print();
    }
}
