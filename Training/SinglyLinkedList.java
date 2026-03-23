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

    void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.next != null ? temp.data + " -> " : temp.data);
            temp = temp.next;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.displayList();
    }
}