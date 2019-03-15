package Easy;

import java.util.Scanner;

public class GokiAndHisBreakup 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter no");
		
		int no=sc.nextInt();
		int p[]=new int[no];
		//System.out.println("skill");
		int skill=sc.nextInt();
		
		
		for(int i=0;i<no;i++)
		{
			p[i]=sc.nextInt();
		}
		System.out.println(p);
		
		for(int i=0;i<p.length;i++)
		{
			if(p[i]<skill)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
		
		
	}
}
