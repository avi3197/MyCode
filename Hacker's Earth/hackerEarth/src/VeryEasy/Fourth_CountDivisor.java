package VeryEasy;

import java.util.Scanner;

public class Fourth_CountDivisor 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt(),last=sc.nextInt(),divisible=sc.nextInt();
		
		for(int i=first;i<=last;i++)
		{
			if(i%divisible==0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
