package FIFO;
import java.util.PriorityQueue;
import java.util.Queue;

public class FIFO_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);

        // Enqueue elements
        queue.add(91);
        queue.add(49);
        queue.add(159);

        // Dequeue elements
        System.out.println(queue.poll()); 
        System.out.println(queue.poll()); 
        System.out.println(queue.poll()); 
	}

}
