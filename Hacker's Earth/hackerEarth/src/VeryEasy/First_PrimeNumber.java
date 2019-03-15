package VeryEasy;

import java.util.Scanner;

public class First_PrimeNumber 
{
	public static void main(String[] args) 
	{
		int count=0;
		
		System.out.println("enter value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
		
	}
}
