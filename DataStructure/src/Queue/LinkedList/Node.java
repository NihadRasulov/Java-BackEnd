package Queue.LinkedList;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using Linked List
class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue operation (insert at rear)
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // If queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued into queue.");
    }

    // Dequeue operation (remove from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;

        // If front becomes null, set rear to null as well (queue is empty)
        if (front == null) {
            rear = null;
        }

        return dequeuedValue;
    }

    // Peek operation (view front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
