package LinkedList;
//We have to find the starting Node of the loop
public class DetectCycleTwo {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert(int v) {
        Node newnode = new Node(v);
        if (head == null) {
            head = newnode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newnode;
        }
    }
    public Node detectCycle(Node head){
        if(head==null || head.next==null)
        return null;
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                Node entry=head;
                while(entry!=fast){
                    entry=entry.next;
                    fast=fast.next;
                }
                return entry;
            }
        }
            return null;
    }
    public void createCycle(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node temp=head;
        Node slow=head;
        while(slow.next!=null){
            slow=slow.next;
        }
        slow.next=head.next;
    }
    public static void main(String args[]) {
        DetectCycleTwo ob = new DetectCycleTwo();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insert(5);
        ob.createCycle(ob.head);
        Node result = ob.detectCycle(ob.head);
        if(result!=null)
        System.out.println("Does the LinkedList contain a loop is yes, " + result.data);
        else
        System.out.println("Loop does not exists.");
    }
    
}
