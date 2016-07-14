import java.util.*;
import java.io.File;

class BinarySearch_java{

	public static int binary_search(ArrayList<Integer> arr, int x){
		int l=0; int r= arr.size()-1;
		while(l<=r){
			int mid= (l+r)/2;
			if (arr.get(mid)==x) return mid;
			else if (arr.get(mid)>x) r=mid-1;
			else l= mid+1;
		}
		return -1;
	}
	
	public static void main(String args[]){
		int T;
		Scanner scanner= new Scanner(System.in);
		T= scanner.nextInt();
		if(T<=0){
			System.out.println("T is less than 1");
			return;
		}
		while(T>0){
			T=T-1;
			int N= scanner.nextInt();
			if(N<=0){
                        	System.out.println("N is less than 1");
				return;
                	}
			ArrayList<Integer> arr= new ArrayList<Integer>();
			int loop=0;
			while(loop<N){
				loop+=1;
				arr.add(scanner.nextInt());
				
			}
			int x= scanner.nextInt();
			System.out.println(binary_search(arr,x));
		}
		scanner.close();	
	}
}
