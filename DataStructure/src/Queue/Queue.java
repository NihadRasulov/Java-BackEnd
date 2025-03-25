package Queue;

public class Queue {
    private int[] queue;
    private int front, rear, capacity, size;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation (insert element at rear)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = value;
        size++;
        System.out.println(value + " enqueued into queue.");
    }

    // Dequeue operation (remove element from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return -1;
        }
        int dequeuedValue = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return dequeuedValue;
    }

    // Peek operation (view front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
    }
}
