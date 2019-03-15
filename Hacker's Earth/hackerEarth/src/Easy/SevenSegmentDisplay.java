package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SevenSegmentDisplay 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("enter no of itearation");
		int no=sc.nextInt();
		String finalString="";
		int arr[]=new int[no];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Map<Integer, Integer> map1=new HashMap<Integer, Integer>();
		map1.put(0, 6);
		map1.put(1, 2);
		map1.put(2, 5);
		map1.put(3, 5);
		map1.put(4, 4);
		map1.put(5, 5);
		map1.put(6, 6);
		map1.put(7, 3);
		map1.put(8, 7);
		map1.put(9, 6);
		
		for(int i=0;i<arr.length;i++)
		{
			int value1=arr[i];
			int n,value=0;
			
			if(value1!=0)
			{
				while(value1>0)
				{
					n=value1%10;
					value=value+map1.get(n);
					value1=value1/10;
				}
			}
			else
			{
				value=6;
			}
			//System.out.println(value);
			if(value%2 !=0)
			{
				int ite=value/2;
				int finalItr=ite-1;
				finalString=finalString.concat("7");
				for(int j=1;j<=finalItr;j++)
				{
					finalString=finalString.concat("1");
				}
				System.out.println(finalString);
				finalString="";
			}
			else
			{
				int ite=value/2;
				for(int j=1;j<=ite;j++)
				{
					finalString=finalString.concat("1");
				}
				System.out.println(finalString);
				finalString="";
			}
		}
		
	}
}
