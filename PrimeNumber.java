import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int n,temp=1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		n = sc.nextInt();

		if (n==1)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			for (int i=2;i<n;i++)
			{
				if (n%i==0)
				{
					temp=0;
					break;
				}
			}
		}

		if (temp == 1)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
	}
}
