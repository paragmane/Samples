package practice;

public class palindrome
{
	public static void main(String[] args)
	{
		String s = "madam";
		
		for(int i=0, j=s.length()-1; i<=j; i++,j--)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				System.out.println("String '"+s+"' is not palindrome");
				return;
			}
		}
		System.out.println("String '"+s+"' is palindrome");
	}
}
