package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Duration_completed 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("no of iterations");
		int iterations=sc.nextInt();
		
		for(int x=1;x<=iterations;x++)
		{
			int no1=sc.nextInt(),
			no2=sc.nextInt(),
			no3=sc.nextInt(),
			no4=sc.nextInt(),
			mincount=0;

			System.out.println(no1+","+no2+","+no3+","+no4);
			
			for(int i=no2;i<=60;i++)
			{
				mincount++;
			}
			
			System.out.println(mincount);
			no1=no1+1;
			for(int i=no1;i<=no3;i++)
			{
				if(i!=no3)
				{
					for(int j=1;j<=60;j++)
					{
						mincount++;
					}
				}
				else
				{
					for(int j=1;j<no4;j++)
					{
						mincount++;
					}
				}
			}
			
			System.out.println(mincount);
			
			int hr=0;
			int min=0;
			
			if(no4 == 00)
			{
				mincount=mincount-1;
			}
			
			hr=mincount/60;
			min=mincount%60;
			
			System.out.println(hr);
			System.out.println(min);
		
			list.add(hr);
			
				list.add(min);
				
			System.out.println(list);
		}
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" "+list.get(i+1));
			i++;
		}
		
}
}
