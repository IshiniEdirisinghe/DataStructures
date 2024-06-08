package FIFO;
import java.util.ArrayDeque;
import java.util.Queue;

public class FIFO_ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Queue<Integer> queue = new ArrayDeque<>();

	        // Enqueue elements
		  	queue.add(72);
	        queue.add(18);
	        queue.add(10);

	        // Dequeue elements
	        System.out.println(queue.poll()); // Output: 1
	        System.out.println(queue.poll()); // Output: 2
	        System.out.println(queue.poll()); // Output: 3
	     
	}

}
