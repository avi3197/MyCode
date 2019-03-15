package VeryEasy;

import java.util.Scanner;

public class Fifth_ToggleString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String string="";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=65;j<=90;j++)
			{
				if(c[i]==(char)j)
				{
					string = string+Character.toLowerCase(c[i]);
				}
			}
			for(int k=97;k<=122;k++)
			{
				if(c[i]==(char)k)
				{
					string = string+Character.toUpperCase(c[i]);
				}
			}
		}
		System.out.println(string);
	}
}
