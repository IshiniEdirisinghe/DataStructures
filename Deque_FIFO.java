package Deque;
import java.util.LinkedList;
import java.util.Queue;


public class Deque_FIFO<T> {


		    private Queue<T> frontQueue;
		    private Queue<T> backQueue;

		    public Deque_FIFO() {
		        frontQueue = new LinkedList<>();
		        backQueue = new LinkedList<>();
		    }

		    public void addFirst(T element) {
		        frontQueue.add(element);
		    }

		    public void addLast(T element) {
		        backQueue.add(element);
		    }

		    public T removeFirst() {
		        if (frontQueue.isEmpty()) {
		            while (!backQueue.isEmpty()) {
		                frontQueue.add(backQueue.remove());
		            }
		        }
		        return frontQueue.poll();
		    }

		    public T removeLast() {
		        if (backQueue.isEmpty()) {
		            while (!frontQueue.isEmpty()) {
		                backQueue.add(frontQueue.remove());
		            }
		        }
		        return backQueue.poll();
		    }

		    public boolean isEmpty() {
		        return frontQueue.isEmpty() && backQueue.isEmpty();
		    }

		    public int size() {
		        return frontQueue.size() + backQueue.size();
		    }

		    public static void main(String[] args) {
				// TODO Auto-generated method stub
				
		    	Deque_FIFO<Integer> deque = new Deque_FIFO<>();
		        deque.addFirst(67);
		        deque.addFirst(9);
		        deque.addLast(38);
		        deque.addLast(15);


		        System.out.println(deque.removeFirst());
		        System.out.println(deque.removeLast()); 
		        System.out.println(deque.removeFirst()); 
		    }
		

	

}
