package LinkedList;

public class ReversingLinkedList {

    // Define the Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
     //creating a linkedlist
    public void insert(int v) {
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

    // Reverse function
    public Node reverse(Node head) {
        if (head == null) return head;

        Node cur = head;
        Node prev = null;

        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        head = prev;
        return head;
    }

    // Print linked list
    public  void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    // Main function 
    public static void main(String[] args) {
        ReversingLinkedList obj=new ReversingLinkedList();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        System.out.println("Linked List before reversing");
        printList();
        System.out.println("Reversed Linked List:");
        printList();
    }
}
