package VeryEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sixth_FindProductModulo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		int product=1;
		int value;
		System.out.println("enter data");
		
		for(int i=0;i<size;i++)
		{
			value=sc.nextInt();
			product=(product*value);
		}
		
		System.out.println(product);
		
	}
}
