package Other;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			
		String str=sc.next();
		int no=sc.nextInt();
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<no;i++)
		{
			if(ch[i]=='9')
			{
				count++;
			}
		}
		int a=0;
		for(int i=0;i<no+count;i++)
		{
			if(ch[i]=='9')
			{
				a++;
			}
		}
		for(int i=0;i<no+count+a;i++)
		{
			ch[i]='9';
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}
