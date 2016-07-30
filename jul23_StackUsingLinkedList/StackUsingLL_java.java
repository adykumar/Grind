import java.util.*;

class StackUsingLL {


	public static void main(String args[]) {

		LinkedList list= new LinkedList();
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		for(int i=0;i<N;i++) {
			list.push(scanner.nextInt());
		}
		int P= scanner.nextInt();
		for(int i=0;i<P;i++) {
			if (!list.isEmpty()) System.out.println(list.pop());
			else System.out.println("Cant pop, list empty");
		}
		if (!list.isEmpty()) System.out.println("Peeking: " +list.peek());

		/*
		Link
		edList list1= new LinkedList();
		list1.push(3);
		list1.push(2);
		list1.push(11);
		System.out.println(list1.pop());
		
		//Node trav= list1.head.next;
		///while(trav!=null) 	{
		//	System.out.println(trav.data);
		//	trav= trav.next;
		//System.out.println(list1.head.next.data);
		//}*/
	}
}