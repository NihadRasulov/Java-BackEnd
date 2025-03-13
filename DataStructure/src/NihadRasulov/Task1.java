package NihadRasulov;

public class Task1 {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.front()); // 10
        System.out.println("Rear: " + queue.rear()); // 30
        System.out.println("Is Empty: " + queue.isEmpty()); // false

        System.out.println("Total Sum: " + queue.totalSum()); // 60

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.front()); // 20
        System.out.println("Is Empty " + queue.isEmpty()); // false


//        queue.enqueue(40);
//        queue.enqueue(50);
//        System.out.println("End: " + queue.rear()); // 50
//        System.out.println("Total Sum: " + queue.totalSum()); // 140
//
//        queue.dequeue();
//        System.out.println("End: " + queue.rear()); // 50
//        System.out.println("Total Sum: " + queue.totalSum()); //120
//        System.out.println("Is Empty " + queue.isEmpty()); // false
//
//        queue.dequeue(); // remove 30
//        queue.dequeue(); // remove 40
//        queue.dequeue(); // remove 50

//        queue.dequeue();  // error because node is null here is no any value
//        System.out.println("End: " + queue.rear());
//        System.out.println("Total Sum: " + queue.totalSum());
//        System.out.println("Is Empty " + queue.isEmpty());

    }

}

class Queue {
    Node front;
    Node end;
    int totalSum;

    public Queue() {
        this.front = null;
        this.end = null;
        this.totalSum = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            end = newNode;
        } else {
            end.nextNode = newNode;
            newNode.previousNode = end; // bu hissede bir az komek almisam
            end = newNode;
        }
        totalSum += value;

    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            int value = front.value; // baslangic ededi saxlayiriq cunki bizden baslangic ededi return etmek teleb olunur
            // eger baslangic ededi saxlamasaq bize front olaraq yeni deyeri verecek amma dequeued ve sum sehv olacaq

            front = front.nextNode; // baslangici  frontun nexti edirik cunki front silinir
            totalSum -= front.value;
            return front.value;
        }

    }

    public int front() {
        if (isEmpty()) {
            return -1;
        } else {
            return front.value;
        }
    }

    public int rear() {
        if (isEmpty()) {
            return -1;
        } else {
            return end.value;
        }

    }

    public boolean isEmpty() {
        if (front == null && end == null) {
            return true;
        } else {
            return false;
        }
    }

    public int totalSum() {
        return totalSum;
    }
}


class Node {
    int value;
    Node previousNode;
    Node nextNode;

    public Node(int value) {
        this.value = value;
        this.previousNode = null;
        this.nextNode = null;
    }
}

