import java.util.*;
//import GenericBinarySearch;

class MainBinarySearch1 {
	
	public static void main(String args[]) { // driver function
		Scanner scanner= new Scanner(System.in);
		int N= scanner.nextInt();   // read the number of elements
		String[] studentName= new String[N];   // students
		Float[] sortedStudentGpa= new Float[N];  // GPAs in non-decreasing order 
		scanner.nextLine();   // move to the next line (otherwise new line will be read as next string)
		for(int i=0;i<N;i++) {
			String line= scanner.nextLine();   // read the whole line <"Student" GPA>
			String[] parts= line.split(" ");   // split by space
			studentName[i]=parts[0];
			sortedStudentGpa[i]=Float.valueOf(parts[1]);
			//System.out.println(studentName[i]+" "+sortedStudentGpa[i]);
		}
		float X= Float.valueOf( scanner.nextLine() );
		//System.out.println(searchGeneric(studentName,sortedStudentGpa));
		//searchGeneric(studentName,sortedStudentGpa);
		GenericBinarySearch1 obj= new GenericBinarySearch1();
		int index= obj.binarySearch(sortedStudentGpa,N,X);
		System.out.println("Found "+ X +" at Index: "+index);
		System.out.println(studentName[index]+" has GPA "+X);
	}
}
