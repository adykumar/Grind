import java.util.*;

class PivotedBS {

	public static int findPivot(List<Integer> arr, int len) {
		if (len==1) return 0;
		int left=0;
		int right= len-1;
		//System.out.print(left+" "+right+" ");
		while(right-left>1) {
			int mid= (left+right)/2;
			if(arr.get(left)<=arr.get(mid))  left=mid;
			if(arr.get(right)>=arr.get(mid)) right=mid;
		}
		return right;
	}

	public static int findPivotedBinary(List<Integer> arr, int size, int X) {
		int pivot= findPivot(arr, size);
		//System.out.print(pivot+" ");
		int left=0;
		int right= size-1;
		while(left<=right) {
			int mid= (left+right)/2;
			if(arr.get( ((mid+pivot) % size)) == X ) return (mid+pivot)%size;
			else if (arr.get( ((mid+pivot) % size)) > X ) right= mid-1;
			else left= mid+1; 
		}
		return -1;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int T= scanner.nextInt();
		for (int i=0;i<T;i++) {
			int N= scanner.nextInt();
			List<Integer> arr= new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				arr.add(scanner.nextInt());
			}
			int X= scanner.nextInt();

			System.out.println(findPivotedBinary(arr, arr.size(), X));
		}
	}
}