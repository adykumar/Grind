import java.util.*;
/* REQUIRED FUNCTIONALITY---
- insert at front
- insert at end
- insert after given node

*/
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

	public void deleteByKey(int x) {
		Node trav= head;
		while(trav.next!=null) {
			if (trav.next.data == x) {
				trav.next= trav.next.next;
			}
			if (trav.next!=null) trav= trav.next;
		}
	}

	public void deleteByPos(int x) {
		Node trav= head;
		while (x>0 && trav.next!=null) {
			trav=trav.next;
			x--;
		}
		if (trav.next!=null) {
			trav.next= trav.next.next;
		}
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