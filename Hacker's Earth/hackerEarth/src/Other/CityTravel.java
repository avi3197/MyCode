package Other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CityTravel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int km=sc.nextInt();
		int k=sc.nextInt();
		int ex=sc.nextInt();
		int sum=0;
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		int no_day=km/k;
		int rem=km%k;
		if(rem != 0)
		{
			int i;
			for(i=1;i<=no_day;i++)
			{
				map.put(i, k);
			}
			map.put(i, rem);
		}
		else
		{
			int i;
			for(i=1;i<=no_day;i++)
			{
				map.put(i, k);
			}
		}
		//System.out.println(no_day+" "+rem);
		//System.out.println(map);
		
		for(int i=1;i<=ex;i++)
		{
			int day=sc.nextInt();
			int hrs=sc.nextInt();
			
			map.put(day, hrs);
			
		}
		
		//System.out.println(map);
		int count=0;
		Set<Integer> keys=map.keySet();
		for(int key:keys)
		{
			if(sum>=km)
			{
				break;
			}
			sum=sum+map.get(key);
			count++;
			
		}
		//System.out.println(sum);
		System.out.println(count);
		
	}
}
