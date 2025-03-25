package Stack.LinkedList;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed into stack.");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}


