package LinkedList;
import java.util.*;


    
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

public class SinglyLL {
	    private Node head;

	    public SinglyLL() {
	        this.head = null;
	    }

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	


	    public static void main(String[] args) {
	        SinglyLL list = new SinglyLL();
	        list.insert(89);
	        list.insert(55);
	        list.insert(20);
	        list.insert(39);
	        list.insert(73);

	        System.out.println("Singly Linked List:");
	        list.display();
	    }
	

}