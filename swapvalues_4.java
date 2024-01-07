package Task8;
import java.util.Scanner;

public class swapvalues_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		 
	      
	 
	        a = a + b;
	        b = a - b;
	        a = a - b;
	 
	        System.out.println("After swapping, a = " + a
	                           + " and b = " + b);
	    }
	

	}

