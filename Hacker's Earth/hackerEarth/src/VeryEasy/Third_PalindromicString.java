package VeryEasy;

import java.util.Scanner;

public class Third_PalindromicString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String reverseString="";
		
		char c[]=string.toCharArray();
		for(int j=c.length-1;j>=0;j--)
		{
			reverseString=reverseString+c[j];	
		}
		if(string.equals(reverseString))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
