package Easy;

import java.util.Scanner;

public class If_Else_statement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		int N=sc.nextInt();
		
		if(N%2!=0)
		{
			System.out.println("Weird");
		}
		else
		{
			if(N==2 || N==3 || N==4 || N==5)
			{
				System.out.println("Nt Weird");
			}
			for(int i=6;i<=20;i++)
			{
				if(N == i)
				{
					System.out.println("Weird");
				}
			}
			if(N>20)
			{
				System.out.println("Not Weird");
			}
		}
		
		
	}
}
