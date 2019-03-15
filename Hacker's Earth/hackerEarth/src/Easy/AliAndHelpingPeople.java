package Easy;

import java.util.Scanner;

public class AliAndHelpingPeople 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no;
		//System.out.println("enter string");
		
		String str=sc.next();
		String str1=str.substring(0, 2);
		char c1[]=str1.toCharArray();
		//System.out.println(str1);
		String str2=str.substring(3, 6);
		char c2[]=str2.toCharArray();
		//System.out.println(str2);
		String str3=str.substring(7, 9);
		char c3[]=str3.toCharArray();
		//System.out.println(str3);
		
		char c[]=str.toCharArray();
		char letter=c[2];
		
		if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y')
		{
			System.out.println("invalid");
			System.exit(0);
		}
		else
		{
			
				no=Character.getNumericValue(c1[0])+Character.getNumericValue(c1[1]);
				if(no%2 != 0)
				{
					System.out.println("invalid");
					System.exit(0);
				}
			no=0;
			for(int i=0;i<c2.length;i++)
			{
				if(i+1 != c2.length)
				{
					no=Character.getNumericValue(c2[i])+Character.getNumericValue(c2[i+1]);
					if(no%2 != 0)
					{
						System.out.println("invalid");
						System.exit(0);
					}
				}
			}
			no=0;
				no=Character.getNumericValue(c3[0])+Character.getNumericValue(c3[1]);
				if(no%2 != 0)
				{
					System.out.println("invalid");
					System.exit(0);
				}
			
			
				System.out.println("valid");
			
		}
		
		
	}
}
