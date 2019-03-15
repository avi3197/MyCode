package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintHacherEarth 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ite=sc.nextInt();
		String str=sc.next();
		String main="hackerearth";
		char ch[]=str.toCharArray();
		char hack[]=main.toCharArray();
		int count=0;
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<hack.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(hack[i]==ch[j])
				{
					count++;
				}
			}
			if(hack[i]=='h' || hack[i]=='a' || hack[i]=='e' || hack[i]=='r')
			{
				map.put(hack[i], count/2);
			}
			else
			{
				map.put(hack[i], count);
			}
			count=0;
		}
		
		System.out.println(map);
		
		int value=Collections.min(map.values());
		System.out.println(value);
		
	}
}
