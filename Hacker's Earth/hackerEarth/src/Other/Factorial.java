package Other;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int sum=1;
		
		for(int i=1;i<=no;i++)
		{
			sum=sum*i;
		}
		System.out.println("fact is = "+sum);
		
	}
}
