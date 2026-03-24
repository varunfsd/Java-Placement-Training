package training;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head, tail;
    int size = 0;

    void addNode(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    void addMid(int data, int pos) {
        if (pos <= 0 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addFirst(data);
            return;
        }

        if (pos == size + 1) {
            addLast(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    void delFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if (head == null) { // list became empty
            tail = null;
        }
    }

    void delLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) { // only one node
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp; // correct
        size--;
    }

    void delMid(int pos) {
        if (pos <= 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            delFirst();
            return;
        }

        if (pos == size) {
            delLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.next != null ? temp.data + " -> " : temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.delMid(2);
        list.displayList();
        System.out.println(list.size);
    }
}