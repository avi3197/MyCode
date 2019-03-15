package PractiseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonFactor 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 element");
		a=sc.nextInt();
		b=sc.nextInt();
		List<Integer> first=new ArrayList<Integer>();
		List<Integer> second=new ArrayList<Integer>();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				first.add(i);
			}
		}
		//System.out.println(first);
		
		for(int i=1;i<=b;i++)
		{
			if(b%i==0)
			{
				second.add(i);
			}
		}
		//System.out.println(second);
		
		List<Integer> l3 = new ArrayList<Integer>(second);
		l3.retainAll(first);
		//System.out.println(l3);
		
		System.out.println(l3.size());
		
	}
}
