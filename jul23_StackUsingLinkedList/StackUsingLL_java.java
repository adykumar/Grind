import java.util.*;

class StackUsingLL {


	public static void main(String args[]) {
		Stack stack= new Stack();
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		for(int i=0;i<N;i++) {
			stack.push(scanner.nextInt());
		}
		int P= scanner.nextInt();
		for(int i=0;i<P;i++) {
			if (!stack.isEmpty()) System.out.println(stack.pop());
			else System.out.println("Cant pop, list empty");
		}
		if (!stack.isEmpty()) System.out.println("Peeking: " +stack.peek());
	}
}