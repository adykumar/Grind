import java.util.*;

class NumberOddOccurence {

	public static int findOddOccuring(List<Integer> arr){
		int result= arr.get(0);
		for(int i=1;i<arr.size();i++) result= result ^ arr.get(i);
		return result;
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int T= scanner.nextInt();
		for(int i=0;i<T;i++){
			int N= scanner.nextInt();
			List<Integer> arr = new ArrayList<Integer>();
			for(int j=0;j<N;j++){
				arr.add(scanner.nextInt());
			}
			System.out.println( findOddOccuring(arr));
		}
	}
}