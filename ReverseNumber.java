//Importing Package of Scanner Class
import java.util.Scanner;

// Class Name
public class ReverseNumber
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int no,digit=0,reverse=0;

		//Taking input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number :");
		no = sc.nextInt();

		while (no!=0)
		{
			digit = no % 10;
			reverse = reverse * 10 + digit;
			no /= 10;
		}

		System.out.println("Reverse ="+reverse);
	}
}
