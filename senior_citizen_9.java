package Task8;
import java.util.Scanner;

public class senior_citizen_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person");
        age=sc.nextInt();
        if(age>=60)
        {
            System.out.println("The person is senior citizen");
        }
        else
        {
            System.out.println("The person not is senior citizen");
        }

	}

}
