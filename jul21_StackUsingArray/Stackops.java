public class Stackops {

	int[] stack;
	int top;
	int Cap;

	public void createStack(int C) {
		Cap=C;
		stack = new int[Cap];
		top=-1;

	}

	public void push(int x) {
			if (top>Cap) return;
			top++;
			stack[top]=x;
	}

	public int pop() {
		if (top != -1) {
			top--;
			return stack[top+1];
		}
		return 0; 
	}

	public boolean isEmpty() {
		if (top==-1) return true;
		return false;
	}

	public boolean isFull() {
		if (top>Cap) return true;
		return false;
	}

	public int peek() {
		if (top==-1) {
			System.out.println("Empty! Cant peek");
			return -1;
		}
		return stack[top];
	}

}
