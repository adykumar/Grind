import java.util.*;

class LinkedList {

	Node head;

	public LinkedList() {
		head= new Node();
	}

	public boolean isEmpty() {
		if (head.next==null) return true;
		return false;
	}

	public void insertAtHead(int x) {
		Node temp= new Node();
		temp.data= x;
		temp.next= head.next;
		head.next= temp;
	}

	public int removeFromHead() {
		if (isEmpty()) {
			//System.out.println("Empty List!");
			return -1;
		}
		int x= head.next.data;
		head= head.next;
		return x;
	}
}