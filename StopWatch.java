import java.util.Scanner;

public class StopWatch 
{
	 public static void main(String[] args)
	{

		long start = 0, stop = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("1.Start StopWatch \n2.Stop StopWatch");

		System.out.println("Enter your Choice :");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				start = System.nanoTime();
				System.out.println("Start Time ="+start);
			break;

			case 2:
				stop = System.nanoTime();
				double time = ((stop - start) / 100000000);
				System.out.println("Time is "+ time +"Second");
			break;

			default:

				System.out.println("Wrong Choice ..!");
			break;
		}
	}
}
