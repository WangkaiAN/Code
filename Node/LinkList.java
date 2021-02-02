package Node;

public class LinkList {

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
    //1. 遍历链表, 打印链表的每个元素
    public static void TraverseE(Node head){
        for(Node cur = head;cur!=null;cur=cur.next){
            System.out.print(cur.val+" ");
        }
    }
    // 2. 遍历链表, 找到链表的最后一个节点
    public static Node TraverseL(Node head){
        Node cur=head;
        while(cur!=null && cur.next!=null){
            cur = cur.next;
        }
        return cur;
    }
    //3. 遍历链表, 找到链表的倒数第二个节点
    public static Node TraverseLS(Node head){
        Node cur=head;
        while(cur!=null && cur.next!=null && cur.next.next!=null){
            cur = cur.next;
        }
        return cur;
    }

    //4.找到链表的第N个节点
    public static Node TraverseN(Node head,int index){
        Node cur=head;
        if(index>=Length(head))
            return null;
        for (int i=1;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    //5.计算链表的长度
    public static int Length(Node head){
        int count=0;
        for (Node cur =head;cur!=null;cur=cur.next){
            count++;
        }
        return count;
    }
    //6.遍历链表，查找链表上是否存在某个元素
    public static boolean Contains(Node head,int num){
        Node cur =head;
        for (;cur!=null;cur=cur.next){
            if(cur.val==num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Node head=GreateLink();
        TraverseE(head);
        System.out.println();
        Node cur = TraverseL(head);
        System.out.println(cur);
        Node cur1 = TraverseLS(head);
        System.out.println(cur1);
        Node cur2= TraverseN(head,6);
        System.out.println(cur2);
        System.out.println(Length(head));
        System.out.println(Contains(head,4));



    }


}
