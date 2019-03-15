package VeryEasy;

import java.util.Scanner;

public class CheckNoOfInput 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		System.out.println(ch.length);
	}
}
