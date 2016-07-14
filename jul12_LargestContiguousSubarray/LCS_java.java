import java.util.*;

class LCS {

	public static int[] findLCS(List<Integer> arr, int size) { // accept array and array-size
		int result[]={0,0,0};  // array to return the max sum and start and end positions
		List<Integer> max= new ArrayList<Integer>();  // store cumulative maximums
		max.add(arr.get(0));
		for(int i=1;i<size;i++) {  // function evaluates cumul maximums
			if (arr.get(i)+max.get(i-1) > arr.get(i)) max.add(arr.get(i)+max.get(i-1));
			else max.add(arr.get(i)); 
		}

		result[0]=max.get(0);
		for(int i=size-1;i>=0;i--) {  // find end index
			if(i==0 || max.get(i)> max.get(i-1)) {
				result[0]= max.get(i);
				result[2]=i;	
				break;		
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
		Scanner scanner = new Scanner (System.in);
		int T= scanner.nextInt();
		for(int i=0;i<T;i++){
			int N= scanner.nextInt();
			List<Integer> arr= new ArrayList<Integer>();
			for(int j=0;j<N;j++){
				arr.add(scanner.nextInt());
			}
			int result[]= findLCS(arr, arr.size());
			/*for(int j=0;j<N;j++){
				System.out.print(arr.get(j)+" ");
			}*/
			System.out.println();
			System.out.println("Max sum= "+result[0]+" from index: "+result[1]+" to index: "+result[2]);
		}
	}
}
