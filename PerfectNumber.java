
// Importing Package for Scanner Class
import java.util.Scanner;

//Class Name
public class PerfectNumber
{
	//Main Method
	public static void main(String[] args)
	{
		//Variables
		int no, result=0;

		//Scanner Class to take Input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number :");
		no = sc.nextInt();

		//For Loop to get Divisor
		for (int i=1;i<no;i++)
		{
			if (no%i==0)
			{
				result += i;
			}
		}

		// If the given number and Result Match 
		if (no == result)
		{
			System.out.println("Number Is Perfect");
		}
		else
		{
			System.out.println("Number Is Not Perfect");
		}
	}
}
