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

	public void push(int x) {
		Node temp= new Node();
		temp.data= x;
		temp.next= head.next;
		head.next= temp;
	}

	public int pop() {
		if (isEmpty()) {
			//System.out.println("Empty List!");
			return -1;
		}
		int x= head.next.data;
		head= head.next;
		System.out.print("Popped: ");
		return x;
	}

	public int peek() {
		if (!isEmpty()) return head.next.data;
		return 0;
	}
}