class Driver {

	public static void main(String args[]) {
		LinkedList list1= new LinkedList();
		list1.insertAtFront(22);
		list1.display();
		list1.insertAtFront(3);
		list1.display();
		list1.insertAtFront(44);
		list1.display();
		System.out.println(list1.head.next.data);
		System.out.println(list1.tail.next.data);
		list1.insertAtBack(7);
		list1.display();
	}
}