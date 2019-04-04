import java.util.Scanner;

public class VoidType {
	
	
	// global location 
	public static void main(String[] args) {
		
		
		
		VoidType one = new VoidType(); 
		
		one.type(); 
		one.scannerFirstName();
		one.scannerInt();
		
	}
	
	// classes have methods
	
	void type() { System.out.println("No return type");

}
	
	void scannerFirstName() { 
		Scanner scan = new Scanner(System.in); 
		   scan.nextLine();
		
	}
	void scannerInt() { 
		Scanner scan = new Scanner(System.in); 
		scan.nextInt(); 
	}
	}
