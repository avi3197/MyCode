package Medium;

import java.util.Scanner;

public class CheckPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(no%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}
}
