//Importing Package Of Scanner Class
import java.util.Scanner;

//Class Name
public class FibonacciSeries
{
	//Main Method
	public static void main(String[] args)
	{
		//Variables
		int n1=0,n2=1,n3,i,count=10;

		//For to get Fibonacci
		for(i=0;i<count;++i)
		{
			n3=n1+n2;

			System.out.print(" "+n3);

			//Swapping the Numbers
			n1=n2;
			n2=n3;
		}
	}
}
