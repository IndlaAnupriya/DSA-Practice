public class LinkedListCreation {

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

    public void traverse() {
        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        LinkedListCreation ob = new LinkedListCreation();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.traverse();
    }
}
