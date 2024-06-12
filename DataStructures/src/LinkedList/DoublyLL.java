package LinkedList;
import java.util.*;

public class DoublyLL {

 
	    public class Node {
	        int data;
	        Node next;
	        Node prev;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	            this.prev = null;
	        }
	    }

	    protected Node head;
	    protected Node tail;

	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    public Node find(int data) {
	        Node current = head;
	        while (current != null && current.data != data) {
	            current = current.next;
	        }
	        return current;
	    }

	    public int count() {
	        int count = 0;
	        Node current = head;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }

	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL list = new DoublyLL();
	        list.addFirst(97);
	        list.addLast(43);
	        list.addLast(63);
	        list.addLast(16);
	        list.addFirst(61);
	        list.addFirst(33);
	     
	        list.printList();

	        Node value63 = list.find(63);
	        if (value63 != null) {
	            System.out.println("Node with value 63 found: " + value63.data);
	        } else {
	            System.out.println("Node with value 63 not found.");
	        }
	}

}
