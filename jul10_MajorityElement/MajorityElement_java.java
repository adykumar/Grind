import java.util.*;

class MajorityElement {

	public static int[] findMajorityElement(List<Integer> arr) {
		float l= arr.size();
		int focus_ele= arr.get(0);
		float count=0;
		float focus_count=0;
		for(int i=0;i<l;i++) {
			count+=1;
			if(arr.get(i)==focus_ele) focus_count+=1;
			if (focus_count< count/2) {
				focus_ele= arr.get(i);
			}
		}
		int result[]= new int[] {0,0};
		focus_count=0;
		for(int i=0;i<l;i++) {
			if(focus_ele==arr.get(i)) focus_count+=1;
		}
		if(focus_count>l/2) {
			result[0]= focus_ele; 
			result[1]=1; 
		}
		else { 
			int focus2= arr.get(0);
			focus_count=0;
			count=0;
			for(int i=0;i<l;i++) {
				count+=1;
				if(focus2== focus_ele && i+1<l) {
					focus2= arr.get(i+1);
					continue;
				}
				if(arr.get(i)==focus2) focus_count+=1;
				if(focus_count< count/2) focus_ele= arr.get(i);
			}
			if(focus_count>l/2) {
				result[0]= focus2;
				result[1]=1;
			}
			else result[1]=0;
		}
		System.out.print(focus_count+" "+count+" "+l+" ");
		return result;
	}

	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int T= scanner.nextInt();
		for(int i=0;i<T;i++) {
			int N= scanner.nextInt();
			List<Integer> arr= new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				arr.add(scanner.nextInt());
			}
			int[] result= findMajorityElement(arr);
			if (result[1]==1) System.out.println("Majority Element: "+result[0]);
			else System.out.println("NO Majority Element");
		}
	}
}
