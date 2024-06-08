package CircularFIFO;

public class CircularFIFO {

	 private int[] queue;
	    private int maxSize;
	    private int front;
	    private int rear;
	    private int currentSize;

	    public CircularFIFO(int size) {
	        maxSize = size;
	        queue = new int[maxSize];
	        front = -1;
	        rear = -1;
	        currentSize = 0;
	    }

	    public boolean isEmpty() {
	        return currentSize == 0;
	    }

	    public boolean isFull() {
	        return currentSize == maxSize;
	    }

	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue.");
	            return;
	        }

	        if (front == -1) {
	            front = 0;
	        }

	        rear = (rear + 1) % maxSize;
	        queue[rear] = item;
	        currentSize++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }

	        int item = queue[front];
	        if (front == rear) {
	            front = rear = -1;
	        } else {
	            front = (front + 1) % maxSize;
	        }
	        currentSize--;
	        return item;
	    }

	    public void display() {
	        int i = front;
	        if (!isEmpty()) {
	            while (i != rear) {
	                System.out.print(queue[i] + " ");
	                i = (i + 1) % maxSize;
	            }
	            System.out.println(queue[rear]);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CircularFIFO cq = new CircularFIFO(5);
	        cq.enqueue(5);
	        cq.enqueue(67);
	        cq.enqueue(28);
	        cq.enqueue(10);
	        cq.enqueue(38);

	        System.out.println("Queue:");
	        cq.display();

	        System.out.println("Dequeue: " + cq.dequeue());
	        System.out.println("Dequeue: " + cq.dequeue());

	        System.out.println("After dequeuing:");
	        cq.display();
	}

}
