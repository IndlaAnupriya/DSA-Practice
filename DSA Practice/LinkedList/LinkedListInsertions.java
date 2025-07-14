
package LinkedList;

public class LinkedListInsertions {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addFirst(int v) {
        Node newnode = new Node(v);
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int v) {
        Node newnode = new Node(v);
        if (head == null) {
            head = newnode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newnode;
    }

    public void addPosition(int v, int pos) {
        Node newnode = new Node(v);
        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node cur = head;
        int cnt = 1;

        while (cur != null && cnt < pos - 1) {
            cur = cur.next;
            cnt++;
        }

        if (cur == null) {
            System.out.println("Position out of range");
            return;
        }

        newnode.next = cur.next;
        cur.next = newnode;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("LinkedList is empty");
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
        LinkedListInsertions obj = new LinkedListInsertions();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);  // List: 3->2->1
        obj.addLast(4);   // List: 3->2->1->4
        obj.addLast(5);   // List: 3->2->1->4->5
        obj.addPosition(10, 3); // List: 3->2->10->1->4->5
        obj.traverse();
    }
}
