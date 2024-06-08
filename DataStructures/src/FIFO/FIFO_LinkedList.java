package FIFO;
import java.util.LinkedList;
import java.util.Queue;

public class FIFO_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(38);
        queue.add(93);
        queue.add(7);

        // Dequeue elements
        System.out.println(queue.poll()); 
        System.out.println(queue.poll()); 
        System.out.println(queue.poll()); 
    
	}

}
