import java.util.*;

class Segregate01 {

	public static ArrayList<Integer> segreg(ArrayList<Integer> arr) { // function to segregate
		int right= arr.size()-1;
		int i=0;
		while(i<right) {
			if (arr.get(right)==1) {
				right-=1;
				continue;
			}
			if (arr.get(i)==1) {
				int temp= arr.get(i);
				arr.set(i,arr.get(right));
				arr.set(right, temp);
				right-=1;
			}
			i+=1;
		}
		return arr;
	}

	public static void main(String args[]) {   // driver function
		Scanner scanner = new Scanner(System.in);
		int T= scanner.nextInt();  // test cases
		for(int i=0;i<T;i++) {
			int N= scanner.nextInt();  // N elements
			if (N<1) {
				System.out.println("T,N should be > 0");
				return;
			}
			ArrayList<Integer> arr= new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				arr.add(scanner.nextInt());  // arr: create list of N elements
			}	
			ArrayList<Integer> result= segreg(arr);  // result for passed list arr
			for(int j=0;j<N;j++) {
				System.out.print(arr.get(j)+" "); // print out result
			}
			System.out.println();
		}	
	}
}


