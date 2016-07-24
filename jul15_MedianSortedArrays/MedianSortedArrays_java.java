import java.util.*;

class MedianSortedArrays {

	public static double findMedian(List<Integer> arr1, List<Integer> arr2, int size) {
		if (size ==1) return (arr1.get(0)+arr2.get(0))/2;
		//if (size%2==1 && arr1.get(size/2)==arr2.get(size/2)) return arr1.get(size/2);
		//if (size%2==0 && arr1.get(size/2)+arr1.get((size-1)/2) == arr1.get(size/2)+arr1.get((size-1)/2) ) {
		//	return 0.5*((arr1.get(size/2)+arr1.get((size-1)/2)));
		int mid= size/2;
		if (arr1.get(mid)<arr2.get(mid)) {
			for(int i=0;i<mid;i++) arr1.remove(i);
			//for(int i=(mid+1)/2;i<size-1;i++) arr2.remove(i);
		}
		else  {
			for(int i=0;i<mid;i++) arr2.remove(i);
			//for(int i=(mid+1)/2;i<size-1;i++) arr1.remove(i);
		}
		System.out.println(arr1.size()+" "+arr2.size());
		//findMedian(arr1,arr2,arr1.size());
		return 0;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int T= scanner.nextInt();
		for (int i=0;i<T;i++) {
			//int N1= scanner.nextInt();
			int N= scanner.nextInt();
			List<Integer> arr1= new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				arr1.add(scanner.nextInt());
			}
			List<Integer> arr2= new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				arr2.add(scanner.nextInt());
			}
			double result= findMedian(arr1,arr2, arr1.size());
			System.out.println(result);
		}
	}
}