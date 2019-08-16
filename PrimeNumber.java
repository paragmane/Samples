package practice;

public class PrimeNumber
{
	public static void main(String args[])
	{
		int n = 4;
		for(int i=2;i<(n/2)+1;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a Prime number");
				return;
			}
		}
		System.out.println(n+" is Prime number");
	}
}
