import java.util.*;

class DutchNF {

	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in); 
		int N= scanner.nextInt();
		List<Integer> arr= new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			int x= scanner.nextInt();
			if (x==0 || x==1 || x==2) arr.add(x);
			else {
				System.out.println("Invalid input...");
				return;
			}
		}
		// logic below
		int left=0;
		int right= arr.size()-1;
		int i=0;
		
		while(i<=right) {
			if (arr.get(i)==0) {
				arr.set(i,arr.get(left));
				arr.set(left,0);
				left++;				
			}
			if (arr.get(i)==2){
				arr.set(i,arr.get(right));
				arr.set(right,2);
				right--;
				continue;				
			}
			i++;
		}
		System.out.println(i+" "+left+" "+right);
		for(int j=0;j<N;j++) {
			System.out.print(arr.get(j)+" ");
		}
		System.out.println();
	}
}