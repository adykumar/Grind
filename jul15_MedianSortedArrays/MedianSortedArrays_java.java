import java.util.*;

class MedianSortedArrays {

	public static double findMedian(List<Integer> arr1, List<Integer> arr2, int size) {
		/*
		for(int a=0;a<size;a++) System.out.print(arr1.get(a)+" ");
		System.out.println();
		for(int a=0;a<size;a++) System.out.print(arr2.get(a)+" ");
		System.out.println();*/
		if (size ==1) return (arr1.get(0)+arr2.get(0))/2;
		if (size ==2) {
			float sum= arr1.get(0)+arr1.get(1)+arr2.get(0)+arr2.get(1);
			int min= arr1.get(0) < arr2.get(0) ? arr1.get(0) : arr2.get(0);
			int max= arr1.get(1) > arr2.get(1) ? arr1.get(1) : arr2.get(1);
			return (sum-min-max)/2;			
		}
		int mid= (size-1)/2;
		int median1; int median2;
		if (size%2==1) {
			median1= arr1.get(mid);
			median2= arr2.get(mid);
		}
		else {
			median1= arr1.get(mid)+arr1.get(mid+1);
			median2= arr2.get(mid)+arr2.get(mid+1);
		}

		if (arr1.get(mid)<arr2.get(mid)) {
			for(int i=0,j=size-1; i<mid; i++,j--) {
				arr1.remove(0);
				arr2.remove(j);
			}
		}
		else  {
			//System.out.println("--");
			for(int i=0,j=size-1; i<mid; i++,j--) {
				arr1.remove(j);
				arr2.remove(0);
			}
		}
		return findMedian(arr1,arr2,arr1.size());
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