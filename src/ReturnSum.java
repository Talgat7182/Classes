
import java.util.Scanner;

public class ReturnSum { 

	public static void main(String[] args) {

		ReturnSum obj = new ReturnSum();

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		obj.sum(a, b);
		// expecting numbers  
		
	}

	
	int sum(int x, int y) {

		System.out.println(x + y);

		return x + y;
		
		//System.out.println(x + y);
	}
}
