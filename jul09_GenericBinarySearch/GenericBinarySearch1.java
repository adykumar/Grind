public class GenericBinarySearch1 {
	public static <E extends Comparable<E>> int binarySearch(E[] arr, int size, E x) {
		int l=0;
		int r= size-1;
		while(l<=r) {
			int mid= (l+r)/2;
			if (arr[mid].compareTo(x)==0) return mid;
			else if (arr[mid].compareTo(x)>0) r=mid-1;
			else l=mid+1;
		}
		return -1;
	} 
}
