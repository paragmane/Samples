package practice;

public class NthPrimeNumber
{
	public static void main(String args[])
	{
		int n = 16;
		int i,j,k;
		for(j=0, k=1; j<n; k++)
		{
			inner: for(i=2;i<(k/2)+1;i++)
			{
				if(k%i==0)
				{
//					System.out.println("Non Prime : "+k);
					break inner;
				}
			}
			if(i>(k/2)+1)
			{
				System.out.println((j+1)+"."+k);
				j++;
			}
		}
		System.out.println("\n"+n+"th Prime number : "+(k-1));
	}
}
