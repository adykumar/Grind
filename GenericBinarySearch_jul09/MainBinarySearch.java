import java.util.*;
//import GenericBinarySearch;

class MainBinarySearch{
	
	public static void main(String args[]) { // driver function
		Scanner scanner= new Scanner(System.in);
		int N= scanner.nextInt();   // read the number of elements
		ArrayList<String> studentName= new ArrayList<String>();   // students
		ArrayList<Float> sortedStudentGpa= new ArrayList<Float>();  // GPAs in non-decreasing order 
		scanner.nextLine();   // move to the next line (otherwise new line will be read as next string)
		for(int i=0;i<N;i++) {
			String line= scanner.nextLine();   // read the whole line <"Student" GPA>
			//System.out.println(line);
			String[] parts= line.split(" ");   // split by space
			//System.out.println(parts[0]+"  "+parts[1]);
			studentName.add(parts[0]);
			sortedStudentGpa.add(Float.valueOf(parts[1]));
			//System.out.println(studentName.get(i)+" "+sortedStudentGpa.get(i));
		}
		//System.out.println(searchGeneric(studentName,sortedStudentGpa));
		//searchGeneric(studentName,sortedStudentGpa);
		GenericBinarySearch obj= new GenericBinarySearch();
		int x= obj.binarySearch(sortedStudentGpa);
		System.out.println(x);
	}
}
