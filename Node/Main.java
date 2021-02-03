package Node;

public class Main {
    public static Node GreateLink(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }

    //打印一个链表
    public static void print(Node head ){
        Node cur=head;
        while(cur!=null ){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //.计算链表的长度
    public static int Length(Node head){
        int count=0;
        for (Node cur =head;cur!=null;cur=cur.next){
            count++;
        }
        return count;
    }
    //遍历链表，查找链表上是否存在某个节点
    public static Node Contains(Node head,Node item){
        Node cur =head;
        for (;cur!=null;cur=cur.next){
            if(cur.val==item.val){
                return cur;
            }
        }
        return null;
    }
    //中间插入
    public static Node MidInsertion(Node head,Node Insert,int index){
        Node cur = head;
        if(index<0||index>Length(head))
            return null;
        for (int i=0;i<index-1;i++){
            cur=cur.next;
        }
        Insert.next=cur.next;
        cur.next=Insert;
        return cur;
    }
    //头部插入
    public static Node HeadInsertion(Node head,Node Insert){
        Node cur = head;
        Insert.next=cur;
        cur=Insert;
        return cur;
    }
    //尾部插入
    public static Node LastInsertion(Node head,Node Insert){
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=Insert;
        return head;
    }
    //中间删除(按照值)
    public static void MidRemove(Node head,int value){
        Node cur=head;
        while(cur!=null && cur.next!=null && cur.next.val!=value){
            cur=cur.next;
        }
        if(cur==null||cur.next==null){
            return;
        }
        cur.next=cur.next.next;
    }
    //中间删除(按照节点删除)
    public static void MidRemove(Node head,Node Delete){
        if(Contains(head,Delete) instanceof Node){
            Node toDelete=Contains(head,Delete);
            toDelete.val=toDelete.next.val;
            toDelete.next=toDelete.next.next;
        }
    }
    //删除(给定下标删除)
    public static Node RemoveIndex(Node head,int index){
        if(index<0 ||index>=Length(head))
            return null;
        Node cur=head;
        if(index==0){
            cur=cur.next;
            return cur;
        }
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
    //头部删除
    public static Node HeadRemove(Node head){
        head=head.next;
        return head;
    }
    //尾部删除
    public static void LastRemove(Node head){
        Node cur = head;
        while(cur.next.next!=null){
            cur=cur.next;
        }
        cur.next=null;
    }

    public static void main(String[] args) {
        Node head=GreateLink();
        print(head);
        Node Insert=new Node(10);
        MidInsertion(head,Insert,3);
        print(head);

        Node Insert1=new Node(10);
        head=HeadInsertion(head,Insert1);
        print(head);

        Node Insert2=new Node(10);
        LastInsertion(head,Insert2);
        print(head);

        MidRemove(head,10);
        print(head);

        Node Delete = new Node(1);
        MidRemove(head,Delete);
        print(head);

        head=RemoveIndex(head,4);
        print(head);

        head=HeadRemove(head);
        print(head);

        LastRemove(head);
        print(head);
    }
}
