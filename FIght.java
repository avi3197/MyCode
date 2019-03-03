package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FIght 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ite=sc.nextInt();
		
		for(int i=1;i<=ite;i++)
		{
			int boys=sc.nextInt();
			int girls=sc.nextInt();
			
			List<Integer> boy=new ArrayList<Integer>();
			List<Integer> girl=new ArrayList<Integer>();
			
			for(int j=1;j<=boys;j++)
			{
				boy.add(sc.nextInt());
			}
			for(int k=1;k<=girls;k++)
			{
				girl.add(sc.nextInt());
			}
			
			
			
			Collections.sort(boy);
			Collections.sort(girl);
			
			System.out.println(boy);
			System.out.println(girl);
			
			List<Integer> list=new ArrayList<Integer>();
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			
			for(int b:boy)
			{
				for(int g:girl)
				{
					if(g<b)
					{
						list.add(g);
					}
				}
				
				map.put(b, list.get((list.size())-1));
			}
			System.out.println(map);
			
			
			
		}
		
	}
}
