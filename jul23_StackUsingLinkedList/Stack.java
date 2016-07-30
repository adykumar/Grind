class Stack {

	LinkedList list;
	public Stack() {
		list= new LinkedList();
	} 

	public boolean isEmpty() {
		if (list.head.next==null) return true;
		return false;
	}

	public void push(int x) {
		list.insertAtHead(x);
	}

	public int pop() {
		int x=-1;
		if 
			(!isEmpty()) x=list.removeFromHead();
		else 
			System.out.println("Cant pop...");
		return x;
	}

	public int peek() {
		return list.head.next.data;
	}
}