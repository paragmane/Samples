package practice;

public class SecondLargest
{
	public static void main(String args[])
	{
		int arr[] = {10, 9, 11, 15, 17, 25, 20};
		int max1, max2;
		max1= arr[0];
		max2 = arr[1];
		for(int i=1; i<arr.length; i++)
		{
			if(max1<arr[i] && max2<arr[i])
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(max2<arr[i] && max1>=arr[i])
			{
				max2 = arr[i];
			}
		}
		if(max1 < max2)
		{
			int tmp = max2;
			max2 = max1;
			max1 = tmp;
		}
		System.out.println("Max is : "+max1);
		System.out.println("Max 2 is : "+max2);
	}
}
