package Other;

import java.util.Scanner;

public class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		long arr[] = new long[size];
		long sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+(sc.nextInt());
		}
		System.out.println(sum);
	}
}
