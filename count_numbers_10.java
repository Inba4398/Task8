package Task8;
import java.util.Scanner;

public class count_numbers_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int count = 0;
	      System.out.println("Enter a number :");
	      int num = sc.nextInt();
	      while(num!=0){
	         num = num/10;
	         count++;
	      }
	      System.out.println("Number of digits in the entered integer are : "+count);
	   }

	}


