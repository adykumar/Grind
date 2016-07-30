import java.util.*;

class LinkedList {

	Node head;
	Node tail;

	public LinkedList() {
		head= new Node();
		tail= head;
	}

	public boolean isEmpty() {
		if (head.next==null) return true;
		return false;
	}

	public void insertAtFront(int x) {
		Node temp= new Node();
		temp.data= x;
		temp.next= head.next;
		head.next= temp;
		if (tail==head) tail=tail.next;
	}

	public void insertAtBack(int x) {
		Node temp= new Node();
		temp.data=x;
		tail.next= temp;
		tail=temp;
	}

	public void display() {
		Node trav= head.next;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println();
	}
}