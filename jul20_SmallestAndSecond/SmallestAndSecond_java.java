import java.util.*;

class SmallestAndSecond {

	public static int[] findSmallest1n2(List<Integer> arr){
		int small[]= new int[2];
		small[0]=arr.get(0);
		small[1]=small[0]+1;
		for(int i=1;i<arr.size();i++) {
			if (small[0] > arr.get(i)) {
				small[1]= small[0];
				small[0]= arr.get(i);
			}
			else {
				if (small[1] > arr.get(i)) small[1]=arr.get(i);
			}
		}
		return small;
	}

	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int N= scanner.nextInt();
		List<Integer> arr= new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			arr.add( scanner.nextInt() );
		}
		int result[] = findSmallest1n2(arr);
		System.out.println(result[0]+" "+result[1]);
	}
}