package training;

interface Queue {
	void enque(int data);

	void deque();

	boolean isEmpty();

	boolean isFull();

	int peek();
}

class ArrayQueue implements Queue {
	int[] queue;
	int size = 0, front = -1, rear = -1;

	ArrayQueue(int size) {
		queue = new int[size];
	}

	@Override
	public void enque(int data) {
		if (isFull()) {
			System.out.println("The Queue is Full");
			return;
		}
		if (size == 0) {
			front = 0;
		}
		rear++;
		queue[rear] = data;
		size++;

	}

	@Override
	public void deque() {
		if (isEmpty()) {
			System.out.println("The Queue is Empty");
			return;
		}
		if (front == rear) {
			front = -1;
			rear = -1;
			return;
		}
		front++;
		size--;

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {

		return size == queue.length;
	}

	@Override
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[front];
	}

}

public class ArrayQueueImplementation {

	public static void main(String[] args) {
		Queue qu = new ArrayQueue(3);
		qu.enque(0);
		qu.enque(1);
		qu.enque(2);
		qu.enque(3);
	}
}