import java.util.*;

class MergeArray {

	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int T= scanner.nextInt();
		for(int x=0;x<T;x++) {
			int N1= scanner.nextInt();
			int N2= scanner.nextInt();

			int shortArray[] = new int[N1];
			int longArray[]= new int[N1+N2];

			/// assume both arrays are non-decreasing
			for(int i=0;i<N1;i++) shortArray[i]= scanner.nextInt(); //fill short array with n1 elements
			for(int j=0;j<N2;j++) longArray[j]= scanner.nextInt();  // fill loing array with n2 elements; n1 empty indices follow

			///for(int j=0;j<N2;j++) System.out.print(longArray[j]+" ");		
			int right= N1+N2-1; 									// points at pos. to fill in longArray
			int sap= N1-1; 											// points at end of shortArray
			int lap= N2-1; 											// points at end of filled portion of longArray

			while(right>=0) {
				if (lap==-1) {
					longArray[right]= shortArray[sap];
					right--; sap--;
					continue; 
				}
				if (sap==-1) {
					longArray[right]= longArray[lap];
					right--; lap--;
					continue;
				}
				if(shortArray[sap] > longArray[lap] ) {
					longArray[right]= shortArray[sap];
					right--; sap--;
				}
				else {
					longArray[right]= longArray[lap];
					right--; lap--;
				}
			}
			for(int k=0;k<N1+N2;k++) System.out.print(longArray[k]+" ");
			System.out.println();
		}	
	}
}