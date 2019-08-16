package practice;

public class MovieSearch
{
	public static void main(String[] args)
	{
		String movieList[] = {"The Hero","Shiva the Superhero","Shivaji the boss","Baby boss","Arther king","Theri"};
		int a[] = {0, 0, 0, 0, 0, 0};
		
//		String search[] = {"boss", "The"};
		String search[] = {"boss", "bab"};
		
		for(int i=0;i<search.length; i++)
		{
			for(int j = 0; j < movieList.length; j++)
			{
				if(i == 0)
				{
					if((" " + movieList[j]).toLowerCase().contains(" "+search[i].toLowerCase()))
							a[j]=1;
					else
						a[j]=0;
//					System.out.println("/ "+movieList[j]);
				}
				else if(a[j]==1)
				{
					if((" " + movieList[j]).toLowerCase().contains(" "+search[i].toLowerCase()))
						a[j]=1;
					else
						a[j]=0;
//					System.out.println("/ "+movieList[j]);
				}
//				else
//					System.out.println("X "+movieList[j]);
			}
//			System.out.println("\n");
		}
		
		System.out.println("\n\nFound matching movies : ");
		for(int i = 0; i < movieList.length; i++)
		{
			if(a[i]==1)
				System.out.println(movieList[i]);
//			System.out.println(""+a[i]);
		}
		
	}
}