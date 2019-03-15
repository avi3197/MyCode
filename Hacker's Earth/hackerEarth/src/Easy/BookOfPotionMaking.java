package Easy;

import java.util.Scanner;

public class BookOfPotionMaking 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,j=1;
		System.out.println("enter sttring");
		
		String str=sc.next();
		char c[]=str.toCharArray();
		
		if(c.length != 10)
		{
			System.out.println("Illegal ISBN");
			System.exit(0);
		}
		
		for(int i=0;i<c.length;i++)
		{
			sum=sum+(Character.getNumericValue(c[i])*j);
			j++;
		}
		if(sum%11 == 0)
		{
			System.out.println("Legal ISBN");
		}
		else
		{
			System.out.println("Illegal ISBN");
		}
	}

}
