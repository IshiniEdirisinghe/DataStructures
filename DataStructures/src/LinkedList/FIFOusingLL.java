package LinkedList;
import java.util.*;

public class FIFOusingLL {

	    public class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node front;
	    private Node rear;

	    public FIFOusingLL() {
	        front = null;
	        rear = null;
	    }

	    public void enqueue(int data) {
	        Node newNode = new Node(data);
	        if (rear == null) {
	            front = newNode;
	            rear = newNode;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	    }

	    public int dequeue() {
	        if (front == null) {
	            throw new NoSuchElementException("Queue is empty");
	        }
	        int data = front.data;
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        return data;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public void printQueue() {
	        Node current = front;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIFOusingLL queue = new FIFOusingLL();
	        queue.enqueue(59);
	        queue.enqueue(17);
	        queue.enqueue(68);
	        queue.enqueue(82);
	        queue.enqueue(39);


	        queue.printQueue();

	        System.out.println("Dequeued element: " + queue.dequeue());
	        System.out.println("Dequeued element: " + queue.dequeue());

	        queue.enqueue(99);
	        queue.enqueue(45);

	        queue.printQueue();
	}

}
