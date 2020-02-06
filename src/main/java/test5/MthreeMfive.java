package test5;


public class MthreeMfive 
{

	public static void main(String[] args) 
	{
		int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Resolver");
			}
			else if(i%3==0)
			{
				System.out.println("MThree");
			}
			else if(i%5==0)
			{
				System.out.println("MFive");
			}
			else
			{
				System.out.println(i);
			}
		}

		
	}

}
