import java.util.*;

class ArrayLeaders{
	public static ArrayList<Integer> findArrayLeaders(ArrayList<Integer> arr){
		ArrayList<Integer> result= new ArrayList<Integer>();
		int right= arr.size()-1;
		if (right==0) return arr;
		result.add(arr.get(right));
		for(int i=right-1;i>=0;i--){
			if(arr.get(i)>arr.get(i+1)){
				result.add(arr.get(i));
			}
			else arr.set(i,arr.get(i+1));
		}
		return result;
	}
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		int T= scanner.nextInt(); // read number of test cases
		for(int i=0;i<T;i++){
			int N= scanner.nextInt();  // read number of elements
			ArrayList<Integer> arr= new ArrayList<Integer>(N);
			for(int j=0;j<N;j++){
				arr.add(scanner.nextInt());  // arr: list for the array
			}
			ArrayList<Integer> result= findArrayLeaders(arr);
			for(int k=0;k<result.size();k++) System.out.print(result.get(k)+" ");
			System.out.println();
		}		
		scanner.close();
	}
}
