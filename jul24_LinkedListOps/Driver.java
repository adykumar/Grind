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
			if (parts[0] == "I" || parts[0] == "i") list1.insertAtBack( parseInt(parts[1]) ); 
			if (parts[0] == "K" || parts[0] == "k") list1.deleteByKey ( parseInt(parts[1]) );
			if (parts[0] == "P" || parts[0] == "p") list1.deleteByPos ( parseInt(parts[1]) );
		}
	}
}