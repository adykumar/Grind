import java.util.*;

class MissingNumber {

	public static int findMissing(List<Integer> arr, int size) {  // function to find missing number b/w 1-n
		int sum=0;
		int i;
		for(i=1;i<=size;i++) {
			sum= sum+ arr.get(i-1) -i;
		}
		return (sum-i)*-1;
	}

	public static int findMissingAlternate(List<Integer> arr, int size) {
		int val=0;
		int i;
		for(i=1;i<=size;i++) {
			val= val ^ i ^ arr.get(i-1);
		}
		return val^i;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int T= scanner.nextInt();
		for(int i=0;i<T;i++) {
			int N= scanner.nextInt();
			List<Integer> arr= new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				arr.add(scanner.nextInt());
			}
			System.out.println("Missing Number(Sum algo): "+findMissing(arr, N));
			System.out.println("Missing Number(XOR algo): "+findMissingAlternate(arr, N));
		}
	}
}