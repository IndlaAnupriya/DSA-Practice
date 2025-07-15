public class FindMiddleNodeOfLL {

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

    public int findMiddle(Node head) {
        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String args[]) {
        FindMiddleNodeOfLL ob = new FindMiddleNodeOfLL();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insert(5);
        int result = ob.findMiddle(ob.head);
        System.out.println("The middle element of LinkedList is: " + result);
    }
    
}
