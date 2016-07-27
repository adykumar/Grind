import java.util.*;
/* 	supports CreateStack, Pop, Peek, Push, isFull, isEmpty operations
		Stack Using Array:
		C - Capacity of Stack
		N - Number of elements to push on stack followed by N elements
		P - Number of elements to Pop
		O/P - Popped elements. Finally followed by O/P of Peek.
*/

class StackUsingArray {
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int C= scanner.nextInt();
		int N= scanner.nextInt();
		if (N>C) {System.out.println("Over capacity!"); return;}
		Stackops myStack= new Stackops();
		myStack.createStack(C);
		for(int i=0;i<N;i++) {
			myStack.push(scanner.nextInt());
		}
		int P= scanner.nextInt();
		for(int j=0;j<P;j++) {
			if (! (myStack.isEmpty())) {
				int ele=myStack.pop();
				System.out.println("Popped:"+ele);
			}
			else System.out.println("Cant pop, empty");
		}

		if (! myStack.isEmpty())
			System.out.println("Peeked:" +myStack.peek());
	}
}
