package LinkedList;

public class MyLinkedList {
    private  Node head;//记录头
    private  Node tail;//记录尾节点
    private int length = 0;//元素个数

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    public int getLength(){
        return this.length;
    }
    public void print(){
        Node node = head;
        while(node!=null){
            System.out.print(node);
            node = node.next;
        }
        System.out.println();
    }

    //头插
    public void addFisrt(Node node){
        //空链表
        if(head == null){
            head = node;
            tail = node;
            length++;
            return ;
        }
        //不空
        node.next = head;
        head.prev = node;
        head = node;
        length++;
    }
    //尾插
    public void addlast(Node node){
        //空
        if(head == null){
            head = node;
            tail = node;
            length++;
            return ;
        }
        //不空
        tail.next = node;
        node.prev = tail;
        tail = tail.next;
        length++;
    }
    //随便插
    public void add(int index,Node node){
        if(index<0 || index> length){
            return;
        }
        if(index == 0){
            addFisrt(node);
            return;
        }
        if(index == length){
            addlast(node);
            return;
        }
        Node nextNode = getNode(index);
        node.next = nextNode;
        node.prev = nextNode.prev;

        nextNode.prev.next =node;
        nextNode.prev = node;
        length++;
    }

    //头删
    public void removeFrist(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        head.next.prev =null;
        head = head.next;
        length--;
    }
    //尾删
    public void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        length--;
    }
    //随便删
    public void remove(int index){
        if(index<0 || index>=length){
            return;
        }
        if(index == 0){
            removeFrist();
            return;
        }
        if(index == length-1){
            removeLast();
            return;
        }
        Node toRemove = getNode(index);
        toRemove.prev.next = toRemove.next;
        toRemove.next.prev = toRemove.prev;
        length--;
    }
    //按照节点来进行删除
    public void removeByNode(Node node) {
        int index = indeof(node);
        remove(index);
    }
    //查找
    public Node getNode(int index) {
        Node cur = head;
        for (int i=0;i<index;i++){
            cur =cur.next;
        }
        return cur;
    }
    public int indeof(Node node) {
        Node cur = head;
        for(int i=0;i<length;i++){
            if(cur == node)
                return i;
            cur = cur.next;
        }
        return -1;
    }
    //修改
    public void set(Node node,int value){
        if(indeof(node)==-1){
            return;
        }
        node.val =value;
    }
}
