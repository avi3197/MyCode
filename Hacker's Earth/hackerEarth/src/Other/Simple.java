package Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Simple 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int ite=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=ite;i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int value:list)
		{
			int no=value,k=0;
			for(int i = 1; i <= no; ++i, k = 0) 
			{
	            for(int space = 1; space <= no - i; ++space) 
	            {
	                System.out.print("  ");
	            }

	            while(k != 2 * i - 1) 
	            {
	                System.out.print("*");
	                ++k;
	            }

	            System.out.println();
	        }
		}
		
	}
}
