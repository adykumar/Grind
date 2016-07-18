import java.util.*;

class LCS {

	public static int[] findLCS(List<Integer> arr, int size) { // accept array and array-size
		int result[]={0,0,0};  // array to return the max sum and start and end positions
		List<Integer> max= new ArrayList<Integer>();  // store cumulative maximums
		max.add(arr.get(0));
		System.out.print(max.get(0)+" ");
		for(int i=1;i<size;i++) {  // function evaluates cumul maximums
			if (arr.get(i)+max.get(i-1) > arr.get(i)) max.add(arr.get(i)+max.get(i-1));
			else max.add(arr.get(i));
			System.out.print(max.get(i)+" "); 
		}
		System.out.println();

		result[0]=max.get(size-1);
		result[2]=size-1;
		for(int i=size-2;i>=0;i--) {  // find end index
			if(max.get(i)> result[0]) {
				result[0]= max.get(i);
				result[2]=i;		
			}
		}

		result[1]=result[2];

		for(int i=result[2];i>=0;i--) {  // find start index
			if (max.get(i)>=0) result[1]=i;
			else break; 
		}

		return result;  // 0-max sum, 1-start pos, 2- end pos

	}
	public static void main(String args[]) {
		System.out.println("---------------------------------");
		Scanner scanner = new Scanner (System.in);
		int T= scanner.nextInt();
		for(int i=0;i<T;i++){
			int N= scanner.nextInt();
			List<Integer> arr= new ArrayList<Integer>();
			for(int j=0;j<N;j++){
				arr.add(scanner.nextInt());
			}
			System.out.println("---------");
			
			for(int j=0;j<N;j++){
				System.out.print(arr.get(j)+" ");
			}
			System.out.println();
			int result[]= findLCS(arr, arr.size());
			System.out.println("Max sum= "+result[0]+" from index: "+result[1]+" to index: "+result[2]);
		}
	}
}
