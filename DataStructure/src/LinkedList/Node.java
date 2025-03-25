package LinkedList;


public class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }

        prev.next = temp.next;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List after insertion:");
        list.traverse();

        list.delete(20);
        System.out.println("Linked List after deletion:");
        list.traverse();
    }
}
