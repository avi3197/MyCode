package VeryEasy;

import java.util.Scanner;

public class Second_Factorial 
{
	public static void main(String[] args) 
	{
		int total=1;
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			total=total*i;
		}
		System.out.println(total);
	}
}
