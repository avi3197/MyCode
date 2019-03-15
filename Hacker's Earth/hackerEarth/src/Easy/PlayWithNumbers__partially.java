package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PlayWithNumbers__partially 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter array Size and iterattion");
		int arraySize=sc.nextInt();
		int iterations=sc.nextInt();
		//System.out.println("enter array element");
		int arr[]=new int[arraySize];
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println("enter queues");
		
		for(int i=1;i<=iterations;i++)
		{
			int count=0;
			int sum=0;
			int first=sc.nextInt();
			int second=sc.nextInt();
			
			int first_index=first-1;
			int last_index=second-1;
			
			for(int j=first_index;j<=last_index;j++)
			{
				sum=sum+arr[j];
				count++;
			}
			
			int finalCount=sum/count;
			list.add(finalCount);
			
		}
		
		for(int value:list)
		{
			System.out.println(value);
		}
		
	}
}
