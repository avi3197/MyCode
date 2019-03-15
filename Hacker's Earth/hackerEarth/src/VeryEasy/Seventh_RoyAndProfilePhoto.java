package VeryEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Seventh_RoyAndProfilePhoto 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lenght");
		int length=sc.nextInt();
		System.out.println("enter no of images");
		int no[]=new int[sc.nextInt()];
		List< String> msg=new ArrayList<String>();
		
		System.out.println("enter image width and hight");
		for(int i=0;i<no.length;i++)
		{
			int width=sc.nextInt();
			int height=sc.nextInt();
			
			if(width<length||height<length)
			{
				msg.add("UPLOAD ANOTHER");
			}
			else if(width!=height)
			{
				msg.add("CROP IT");
			}
			else
			{
				msg.add("ACCEPTED");
			}
		}
		for(String ms:msg)
		{
			System.out.println(ms);
		}
		/*for(int key:m.keySet())
		{ 			
			if(key<length||m.get(key)<length)
			{
				System.out.println("UPLOAD ANOTHER");
			}
			else if(key!=m.get(key))
			{
				System.out.println("CROP IT");
			}
			else
			{
				System.out.println("ACCEPTED");
			}
		}*/
		
	}
}
