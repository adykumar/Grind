import java.util.Scanner;
import java.io.File;

class BinarySearch_java{
	public static void main(String args[]){
		if(args.length !=2) {
			System.out.println("Usage: javac BinarySearch_java <inputfile> <outputfile>");
			System.exit(0);
		}	
		Scanner scanner = new Scanner(new File(args[0]));
		int [] arr= new int [100];
		int i=0;
		while(scanner.hasNextInt()){
			arr[i++]= scanner.nextInt();
		}
		for(i=0;i<arr.length;i++) System.out.println(arr[i]);
		
	}
}
