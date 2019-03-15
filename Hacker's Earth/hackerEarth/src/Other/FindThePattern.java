package Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindThePattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ite=sc.nextInt();
		
		List<Long> list=new ArrayList<Long>();
		//2224 5262 223
		
		for(int i=1;i<=ite;i++)
		{
			list.add(sc.nextLong());
		}
		System.out.println((Collections.max(list))+(Collections.min(list)));
	}
}
