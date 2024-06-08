package Steque;
import java.util.LinkedList;

public class Steque {
	 private LinkedList<Integer> list;
	 
	 public Steque() {
	        list = new LinkedList<>();
	    }

	    public void push(int item) {
	        list.addFirst(item);
	    }

	    public void enqueue(int item) {
	        list.addLast(item);
	    }

	    public int pop() {
	        if (list.isEmpty()) {
	            System.out.println("Steque is empty. Cannot pop.");
	            return -1;
	        }
	        return list.removeFirst();
	    }

	    public int dequeue() {
	        if (list.isEmpty()) {
	            System.out.println("Steque is empty. Cannot dequeue.");
	            return -1;
	        }
	        return list.removeFirst();
	    }

	    public void display() {
	        System.out.println("Steque elements: " + list);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Steque steque = new Steque();
        steque.push(81);
        steque.enqueue(46);
        steque.push(58);
        steque.enqueue(93);

        steque.display();

        System.out.println("Pop: " + steque.pop());
        System.out.println("Dequeue: " + steque.dequeue());

        steque.display();
	}

}
