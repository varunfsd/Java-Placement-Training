package training;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    Node front, rear;
    int size = 0;

    public void enqueue(int data) {
        Node newnode = new Node(data);
        size++;

        if (isEmpty()) {
            front = rear = newnode;
            return;
        }

        rear.next = newnode;
        rear = newnode;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        front = front.next;
        size--;

        if (front == null) {

        }
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }
}

public class LinkedListQueueImplementation {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.peek());

        q.dequeue();
        System.out.println(q.peek());
    }
}