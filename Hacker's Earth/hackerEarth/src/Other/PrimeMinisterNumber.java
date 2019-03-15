package Other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeMinisterNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range");
		int first=sc.nextInt();
		int last=sc.nextInt();
		List<Integer> finalList=new ArrayList<Integer>();
		
		for(int i=first;i<=last;i++)
		{
			int no=i,count=0;
			for(int j=1;j<=no;j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				int sum=0;
				while(no>0)
				{
					int n=no%10;
					sum=sum+n;
					no=no/10;
				}
				int count1=0;
				for(int k=1;k<=sum;k++)
				{
					if(sum%k==0)
					{
						count1++;
					}
				}
				if(count1 == 2)
				{
					finalList.add(i);
				}
			}
			
		}
		
		for(int value:finalList)
		{
			System.out.print(value+" ");
		}
		
	}
}
