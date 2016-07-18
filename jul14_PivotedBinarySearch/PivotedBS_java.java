import java.util.*;

class PivotedBS {

	public static int findPivot(List<Integer> arr, int len) {
		if (len==1) return 0;
		int left=0;
		int right= len-1;
		System.out.print(left+" "+right+" ");
		while(arr.get(mid)<arr.get(mid+1) && left) {
			int mid= (left+right)/2;
			if(arr.get(left)<arr.get(mid))  left=mid+1;
			if(arr.get(right)>arr.get(mid)) right=mid-1;
		}
		return left;
	}

	public static int findPivotedBinary(List<Integer> arr, int len) {
		int pivot= findPivot(arr, len);
		return pivot;
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

			System.out.println(findPivotedBinary(arr, arr.size()));
		}
	}
}