import java.util.*;

class Driver {

	public static void main(String args[]) {
		LinkedList list1= new LinkedList();
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		scanner.nextLine();
		for (int i=0;i<N;i++) {
			String s= scanner.nextLine();
			String parts[]= s.split(" ");
			if (parts[0].equals("I"))	list1.insertAtBack( Integer.parseInt(parts[1]) );
			if (parts[0].equals("K")) 	list1.deleteByKey ( Integer.parseInt(parts[1]) );
			if (parts[0].equals("P")) 	list1.deleteByPos ( Integer.parseInt(parts[1]) );
			System.out.print("Input: "+s+" List: "); list1.display();
			//
		}
	}
}